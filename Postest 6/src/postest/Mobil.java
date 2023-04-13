package postest;

abstract class Mobil implements Jenis{
    public String merk;
    public String type;
    public String warna;
    public int tahun;
    public int harga;
    public String jenis;

    public Mobil (String merk, String type, String warna, int tahun, int harga, String jenis) {
        this.merk = merk;
        this.type = type;
        this.warna = warna;
        this.tahun = tahun;
        this.harga = harga;
        this.jenis = jenis;
    }
    
    abstract void setMerk(String merk);
    abstract void setType(String type);
    abstract void setWarna(String warna);
    abstract void setTahun(int tahun);
    abstract void setHarga(int harga);
    
    abstract String getMerk();
    abstract String getType();
    abstract String getWarna();
    abstract int getTahun();
    abstract int getHarga();

    public String display() {
        return merk + " | " + type + " | " + tahun + " | " + warna + " |Rp.  " + harga;
    }
}
