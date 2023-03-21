
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

    public Pembeli(String nama, int nomor, String merk, String type, String warna, int tahun, int harga) {
        super(merk, type, warna, tahun, harga);
        this.nama = nama;
        this.nomor = nomor;
    }
    
    
}
