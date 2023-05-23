package Controller;
import Model.ModelRental;
import View.ViewInput;
import View.ViewPeminjam;
import View.ViewRental;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControllerRental {
    ModelRental model;
    ViewRental view;
    ViewInput input;
    ViewPeminjam peminjam;
    int idtrx=0;//untuk opsi delete dan update
    
    public ControllerRental(ViewInput input, ModelRental model) {
        this.input = input;
        this.model = model;
        
        input.tfTgl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); 
                Date tgl = new Date();
                SimpleDateFormat tanggal=new SimpleDateFormat("yyyy-MM-dd");
                input.setTfTgl(tanggal.format(tgl));
            }
        });
        
        input.cbPlat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.cbPlat.getSelectedItem()=="AB-2325-DD"){
                    input.tfJenis.setText("Mobil Pribadi");
                    input.tfBiaya.setText("400000");
                }else if(input.cbPlat.getSelectedItem()=="AB-9001-PC"){
                    input.tfJenis.setText("Mobil Balap");
                    input.tfBiaya.setText("1000000");
                }else if(input.cbPlat.getSelectedItem()=="AB-5555-BQ"){
                    input.tfJenis.setText("Mobil Off-Road");
                    input.tfBiaya.setText("700000");
                }else if(input.cbPlat.getSelectedItem()=="AB-7001-SS"){
                    input.tfJenis.setText("Mobil Pick-Up");
                    input.tfBiaya.setText("150000");
                }else{
                    input.tfJenis.setText(null);
                    input.tfBiaya.setText(null);
                }
            }
        });
        
        input.bhitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(input.getTfBiaya().isBlank() || input.getTfHari().isBlank()){
                        throw new IllegalAccessException("Data Belum Lengkap");
                    }
                    int total,sewa,hari;
                    sewa=Integer.parseInt(input.getTfBiaya());
                    hari=Integer.parseInt(input.getTfHari());
                    total=sewa*hari;
                    input.setTfTotal(Integer.toString(total));
                }catch(Exception error){
                    JOptionPane.showMessageDialog(null, error.getMessage());
                }
            }
        });
        
        input.bkirim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(input.getTfNama().isBlank() || input.getTfNIK().isBlank() ||
                            input.getTaAlamat().isBlank() || input.getTfNohp().isBlank()){
                        throw new IllegalAccessException("Lengkapi Data Peminjam !");
                    }
                    if(input.getTfTgl().isBlank() || input.getTfHari().isBlank()){
                        throw new IllegalAccessException("Lengkapi Data Sewa !");
                    }
                    if((String)input.cbPlat.getSelectedItem()==null){
                        throw new IllegalAccessException("Lengkapi Data Kendaraan !");
                    }
                    model.inputPeminjam(input.getTfNama(), input.getTfNIK(), 
                            input.getTaAlamat(), input.getTfNohp());
                    int biaya=Integer.parseInt(input.getTfBiaya());
                    int hari=Integer.parseInt(input.getTfHari());
                    int total=Integer.parseInt(input.getTfTotal());
                    model.inputRental(input.getTfNama(), input.getTfTgl(), input.tfJenis.getText(), 
                            (String)input.cbPlat.getSelectedItem(), biaya, hari, total);
                }catch(Exception error){
                    JOptionPane.showMessageDialog(null, error.getMessage());
                }
            }
        });
        
        input.breset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setTfNama("");
                input.setTfNIK("");
                input.setTaAlamat("");
                input.setTfNohp("");
                input.setTfTgl("");
                input.cbPlat.setSelectedIndex(0);
                input.tfJenis.setText("");
                input.setTfBiaya("");
                input.setTfHari("");
                input.setTfTotal("");
            }
        });
        
        input.btransaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.dispose();
                new ViewRental().setVisible(true);
            }
        });
        
        input.bpeminjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.dispose();
                new ViewPeminjam().setVisible(true);
            }
        });
    }

    public ControllerRental(ModelRental model, ViewRental view) {
        this.model = model;
        this.view = view;
        
        String data[][]=model.readData();
        view.getTabel().setModel((new JTable(data,view.Kolom)).getModel());
        
         //input saldo ke view 
        int saldo=model.getSaldo();
        view.setfSaldo("Rp. "+Integer.toString(saldo));
        
        view.getTabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = view.getTabel().getSelectedRow();
                int col = view.getTabel().getSelectedColumn();
                String data = view.getTabel().getValueAt(row, 0).toString();
                idtrx=Integer.parseInt(data);
            }
        });
        
        view.bHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(idtrx==0){
                        throw new IllegalArgumentException("Pilih Data terlebih dahulu");
                    }
                    int input=JOptionPane.showConfirmDialog(null, 
                            " Anda akan menghapus data dengan Id Trx : "+idtrx+" ", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (input==0){
                        model.hapusRental(idtrx);
                        String data[][]=model.readData();
                        view.getTabel().setModel((new JTable(data,view.Kolom)).getModel());
                        int saldo=model.getSaldo();
                        view.setfSaldo("Rp. "+Integer.toString(saldo));
                    }
                    idtrx=0;
                }catch(Exception error){
                    JOptionPane.showMessageDialog(null, error.getMessage());
                }
            }
        });
        
        view.bUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(idtrx==0){
                        throw new IllegalArgumentException("Pilih Data terlebih dahulu");
                    }else{
                        String status=JOptionPane.showInputDialog(null, "Status Baru Id Trx "+idtrx+" : \n(DIBAYAR, DIKEMBALIKAN, BATAL)", "UPDATE STATUS", JOptionPane.OK_CANCEL_OPTION);
                        if(status!=null){
                            model.updateRental(idtrx, status.toUpperCase());
                            String data[][]=model.readData();
                            view.getTabel().setModel((new JTable(data,view.Kolom)).getModel());
                            int saldo=model.getSaldo();
                            view.setfSaldo("Rp. "+Integer.toString(saldo));
                        }
                    }
                    idtrx=0;
                }catch(Exception error){
                    JOptionPane.showMessageDialog(null, error.getMessage());
                }
            }
        });
    }

    public ControllerRental(ModelRental model, ViewPeminjam peminjam) {
        this.model = model;
        this.peminjam = peminjam;
        
        //input data ke tabel
        String data[][]=model.readPeminjam();
        peminjam.getTabel().setModel((new JTable(data,peminjam.Kolom)).getModel());
        
        peminjam.getTabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = view.getTabel().getSelectedRow();
                int col = view.getTabel().getSelectedColumn();
                String data = view.getTabel().getValueAt(row, 0).toString();
                idtrx=Integer.parseInt(data);
            }
        });
        
        
    }
    
    
    
}
