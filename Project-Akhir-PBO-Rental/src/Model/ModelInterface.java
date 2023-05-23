package Model;

public interface ModelInterface {
    String[][] readData();//mengambil data dari database
    String[][] readPeminjam();//mengambil data dari database
    void inputPeminjam(String nama, String nik, String alamat, String hp);//menyimpan data ke database
    void inputRental(String nama, String tgl, String jenis, 
            String plat, int biaya, int hari, int total);//menyimpan data ke database
    void hapusRental(int id);//menghapus data pada database
    void updateRental(int id, String status);//update data pada database
    int getSaldo();
}
