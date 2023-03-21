package postest;

public class Mobil {
    private String merk;
    private String type;
    private String warna;
    private int tahun;
    private int harga;

    public Mobil (String merk, String type, String warna, int tahun, int harga) {
        this.merk = merk;
        this.type = type;
        this.warna = warna;
        this.tahun = tahun;
        this.harga = harga;
    }

    //----------MERK----------
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    //----------TYPE----------
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    //----------WARNA----------
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    //----------TAHUN----------
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    //---------HARGA----------
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String toString () {
        return merk + " | " + type + " | " + tahun + " | " + warna + " |Rp.  " + harga;
    }
}
