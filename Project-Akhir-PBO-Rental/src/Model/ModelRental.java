package Model;

import Controller.Connector;
import java.sql.*;
import javax.swing.JOptionPane;

public class ModelRental implements ModelInterface{
    Connector connector=new Connector();

    public ModelRental() {
    }

    @Override
    public int getSaldo() {
        int saldo=0;
        try{
            String query="SELECT * from rental WHERE status = 'DIKEMBALIKAN' OR status = 'DIBAYAR'";
            connector.stt=connector.con.createStatement();
            ResultSet resultset=connector.stt.executeQuery(query);
            while(resultset.next()){
                saldo=saldo+resultset.getInt("total_biaya");
            }
        }catch(Exception e){
            System.out.println("SQL ERROR ! "+e.getMessage());
        }finally{
            return saldo;
        }
    }
    
    
    
    @Override
    public String[][] readData() {
        String data[][]=new String [50][9];
        try{
            int totalData=0;
            String query="SELECT * from rental";
            connector.stt=connector.con.createStatement();
            ResultSet resultset=connector.stt.executeQuery(query);
            while(resultset.next()){
                data[totalData][0]=resultset.getString("id");
                data[totalData][1]=resultset.getString("peminjam");
                data[totalData][2]=resultset.getString("tgl_pinjam");
                data[totalData][3]=resultset.getString("jenis_mobil");
                data[totalData][4]=resultset.getString("plat_nomor");
                data[totalData][5]=resultset.getString("sewa/hari");
                data[totalData][6]=resultset.getString("lama_sewa");
                data[totalData][7]=resultset.getString("total_biaya");
                data[totalData][8]=resultset.getString("status");
                totalData++;
            }
            connector.stt.close();
        }catch(Exception e){
            System.out.println("SQL ERROR ! "+e.getMessage());
        }finally{
            return data;
        }
    }

    @Override
    public String[][] readPeminjam() {
        String data[][]=new String [50][9];
        try{
            int totalData=0;
            String query="SELECT * from peminjam";
            connector.stt=connector.con.createStatement();
            ResultSet resultset=connector.stt.executeQuery(query);
            while(resultset.next()){
                data[totalData][0]=resultset.getString("Nama");
                data[totalData][1]=resultset.getString("NIK");
                data[totalData][2]=resultset.getString("Alamat");
                data[totalData][3]=resultset.getString("NoHp");
                totalData++;
            }
            connector.stt.close();
        }catch(Exception e){
            System.out.println("SQL ERROR ! "+e.getMessage());
        }finally{
            return data;
        }
    }
    
    @Override
    public void inputPeminjam(String nama, String nik, String alamat, String hp) {
        try {
            String query="INSERT INTO `peminjam`(`Nama`,`NIK`,`Alamat`,`NoHp`) VALUES "
                    + "('"+nama+"','"+nik+"','"+alamat+"','"+hp+"')";
            connector.stt=connector.con.createStatement();
            connector.stt.executeUpdate(query);
            connector.stt.close();
            JOptionPane.showMessageDialog(null, "Input Peminjam Berhasil!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input Peminjam Gagal!"+e);
        }
    }
    
    @Override
    public void inputRental(String nama, String tgl, String jenis, String plat, int biaya, int hari, int total) {
        try {
            String query="INSERT INTO `rental`(`peminjam`,`tgl_pinjam`,`jenis_mobil`,`plat_nomor`,`sewa/hari`,`lama_sewa`,`total_biaya`,`status`) "
                    + "VALUES('"+nama+"','"+tgl+"','"+jenis+"','"+plat+"','"+biaya+"','"+hari+"','"+total+"','')";
            connector.stt=connector.con.createStatement();
            connector.stt.executeUpdate(query);
            connector.stt.close();
            JOptionPane.showMessageDialog(null, "Input Rental Berhasil!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input Rental Gagal!"+e);
        }
    }

    @Override
    public void hapusRental(int id) {
        try {
            String query = "DELETE FROM `rental` WHERE id = '"+id+"'";
            connector.stt=connector.con.createStatement();
            connector.stt.executeUpdate(query);
            connector.stt.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (Exception e) {
            System.out.println("HAPUS GAGAL\n" + e.getMessage());
        }
    }

    @Override
    public void updateRental(int id, String status) {
        try {
            String query = "UPDATE `rental` SET status = '" +status+ "' WHERE id = '"+id+"'";
            connector.stt=connector.con.createStatement();
            connector.stt.executeUpdate(query);
            connector.stt.close();
            JOptionPane.showMessageDialog(null, "Update Status Berhasil!");
        }catch (Exception e) {
            System.out.println("UPDATE GAGAL " + e.getMessage());
        }
    }
    
}

