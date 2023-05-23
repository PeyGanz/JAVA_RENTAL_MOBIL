package View;
import Controller.ControllerRental;
import Model.ModelRental;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewInput extends JFrame{
    JLabel ljudul=new JLabel("DATA PEMINJAM", SwingConstants.CENTER);
    JLabel ljudul2=new JLabel("DATA SEWA", SwingConstants.CENTER);
   
    JLabel lNama = new JLabel("Nama Peminjam");
    JTextField tfNama = new JTextField();
    JLabel lNIK = new JLabel("NIK");
    JTextField tfNIK = new JTextField();
    JLabel lAlamat= new JLabel("Alamat");
    JTextArea taAlamat = new JTextArea();
    JScrollPane spalamat=new JScrollPane();
    JLabel lNohp = new JLabel("No HP");
    JTextField tfNohp = new JTextField();
    
    JLabel lTgl = new JLabel("Tanggal");
    public JTextField tfTgl=new JTextField();
    JLabel lPlat = new JLabel("Plat Nomor");
    String[] Nopol = {null,"AB-2325-DD","AB-9001-PC","AB-5555-BQ","AB-7001-SS"};
    public JComboBox cbPlat = new JComboBox(Nopol);
    JLabel lJenis = new JLabel("Jenis Mobil");
    public JTextField tfJenis=new JTextField();
    JLabel lBiaya = new JLabel("Sewa/hari");
    public JTextField tfBiaya=new JTextField();
    JLabel lHari = new JLabel("Lama Sewa");
    JTextField tfHari = new JTextField();
    JLabel lTotal = new JLabel("Total Biaya");
    JTextField tfTotal = new JTextField();
    
    public JButton bhitung = new JButton("HITUNG");
    public JButton bkirim = new JButton("KIRIM");
    public JButton breset = new JButton("RESET");
    public JButton bpeminjam = new JButton("LIHAT DAFTAR PEMINJAM");
    public JButton btransaksi = new JButton("LIHAT DAFTAR RENTAL");
    
    JPanel panel1=new JPanel();
    
    public ViewInput() {
        setTitle("TAMBAH TRANSAKSI");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        
        new ControllerRental(this, new ModelRental());
        
        add(ljudul);add(ljudul2);
        add(lNama);add(tfNama);
        add(lNIK);add(tfNIK);
        add(lAlamat);add(taAlamat);
        add(lNohp);add(tfNohp);
        
        add(lTgl);add(tfTgl);
        add(lPlat);add(cbPlat);
        add(lJenis);add(tfJenis);tfJenis.disable();
        add(lBiaya);add(tfBiaya);tfBiaya.disable();
        add(lHari);add(tfHari);
        add(lTotal);add(tfTotal);tfTotal.disable();
        add(panel1);add(spalamat);
        
        
        this.getContentPane().setBackground(new java.awt.Color(255, 153, 0));
        
        add(bhitung);add(bkirim);add(breset);add(bpeminjam);add(btransaksi);
        
        ljudul.setBounds(0, 0, 250, 50);
        ljudul.setFont(new java.awt.Font("Perpetua", 1, 20));
        ljudul2.setBounds(250, 0, 250, 50);
        ljudul2.setFont(new java.awt.Font("Perpetua", 1, 20));
        lNama.setBounds(20, 60, 100, 20);
        tfNama.setBounds(130, 60, 100, 20);
        lNIK.setBounds(20, 90, 100, 20);
        tfNIK.setBounds(130, 90, 100, 20);
        lAlamat.setBounds(20, 120, 100, 20);
        taAlamat.setBounds(130, 120, 100, 60);
        taAlamat.setColumns(5);taAlamat.setRows(10);
        spalamat.setBounds(130, 120, 100, 60);
        spalamat.setViewportView(taAlamat);
        lNohp.setBounds(20, 200, 100, 20);
        tfNohp.setBounds(130, 200, 100, 20);
        //Letak Data Rental
        lTgl.setBounds(280, 60, 70, 20);
        tfTgl.setBounds(370, 60, 100, 20);
        lPlat.setBounds(280, 90, 70, 20);
        cbPlat.setBounds(370, 90, 100, 20);
        lJenis.setBounds(280, 120, 70, 20);
        tfJenis.setBounds(370, 120, 100, 20);
        lBiaya.setBounds(280, 150, 70, 20);
        tfBiaya.setBounds(370, 150, 100, 20);
        lHari.setBounds(280, 180, 80, 20);
        tfHari.setBounds(370, 180, 100, 20);
        lTotal.setBounds(280, 260, 70, 20);
        tfTotal.setBounds(370, 260, 100, 20);
        //Letak Button
        bhitung.setBounds(330, 220, 90, 30);
        bkirim.setBounds(160, 300, 90, 30);
        breset.setBounds(250, 300, 90, 30);
        btransaksi.setBounds(130, 350, 250, 40);
        bpeminjam.setBounds(130, 400, 250, 40);
        
        panel1.setBounds(0, 0, 500, 55);
        panel1.setBackground(new java.awt.Color(255, 255, 200));
    }

    public void setTfTgl(String tfTgl) {
        this.tfTgl.setText(tfTgl);
    }

    public String getTfTgl() {
        return tfTgl.getText();
    }
    
    
    public String getTfBiaya() {
        return tfBiaya.getText();
    }

    public String getTfHari() {
        return tfHari.getText();
    }

    public String getTfTotal() {
        return tfTotal.getText();
    }

    public void setTfTotal(String tfTotal) {
        this.tfTotal.setText(tfTotal);
    }

    public String getTfNama() {
        return tfNama.getText();
    }

    public String getTfNIK() {
        return tfNIK.getText();
    }

    public String getTaAlamat() {
        return taAlamat.getText();
    }

    public String getTfNohp() {
        return tfNohp.getText();
    }

    public void setTfNama(String tfNama) {
        this.tfNama.setText(tfNama);
    }

    public void setTfNIK(String tfNIK) {
        this.tfNIK.setText(tfNIK);
    }

    public void setTaAlamat(String taAlamat) {
        this.taAlamat.setText(taAlamat);
    }

    public void setTfNohp(String tfNohp) {
        this.tfNohp.setText(tfNohp);
    }

    public void setTfBiaya(String tfBiaya) {
        this.tfBiaya.setText(tfBiaya);
    }

    public void setTfHari(String tfHari) {
        this.tfHari.setText(tfHari);
    }
    
}
