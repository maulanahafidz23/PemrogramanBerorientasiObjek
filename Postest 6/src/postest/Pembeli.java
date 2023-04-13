
package postest;

public class Pembeli extends Mobil{
    protected String nama;
    protected int nomor;

    public String getNama() {
        return nama;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public Pembeli(String nama, int nomor, String merk, String type, String warna, int tahun, int harga, String jenis) {
        super(merk, type, warna, tahun, harga, jenis);
        this.nama = nama;
        this.nomor = nomor;
    }
    @Override
    public String toString() {
    return "Pembeli{" +
            "Nama    :'" + nama + '\'' +
            ", Nomor :" + nomor +
            ", Merk  :'" + merk + '\'' +
            ", Type  :'" + type + '\'' +
            ", Warna :'" + warna + '\'' +
            ", Tahun :" + tahun +
            ", Harga :" + harga +
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

    @Override
    public void setJenis(String jenis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getJenis() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
