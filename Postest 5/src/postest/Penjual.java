
package postest;


public class Penjual extends Mobil{
    protected String nama;
    protected String kondisi;

    public String getNama() {
        return nama;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public Penjual(String nama, String kondisi, String merk, String type, String warna, int tahun, int harga) {
        super(merk, type, warna, tahun, harga);
        this.nama = nama;
        this.kondisi = kondisi;
    }
    @Override
    public String toString() {
    return "Penjual{" +
            "Nama       :'" + nama + '\'' +
            ", Kondisi  :'" + kondisi + '\'' +
            ", Merk     :'" + merk + '\'' +
            ", Type     :'" + type + '\'' +
            ", Warna    :'" + warna + '\'' +
            ", Tahun    :" + tahun +
            ", Harga    :" + harga +
            '}';
    }

    @Override
    void setMerk(String merk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void setType(String type) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void setWarna(String warna) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void setTahun(int tahun) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void setHarga(int harga) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String getMerk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String getType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String getWarna() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    int getTahun() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    int getHarga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
