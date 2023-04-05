package postest;

abstract class Mobil {
    public String merk;
    public String type;
    public String warna;
    public int tahun;
    public int harga;

    public Mobil (String merk, String type, String warna, int tahun, int harga) {
        this.merk = merk;
        this.type = type;
        this.warna = warna;
        this.tahun = tahun;
        this.harga = harga;
    }

//    //----------MERK----------
//    public String getMerk() {
//        return merk;
//    }
//
//    public void setMerk(String merk) {
//        this.merk = merk;
//    }
//    
//    //----------TYPE----------
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//    
//    //----------WARNA----------
//    public String getWarna() {
//        return warna;
//    }
//
//    public void setWarna(String warna) {
//        this.warna = warna;
//    }
//    
//    //----------TAHUN----------
//    public int getTahun() {
//        return tahun;
//    }
//
//    public void setTahun(int tahun) {
//        this.tahun = tahun;
//    }
//    
//    //---------HARGA----------
//    public int getHarga() {
//        return harga;
//    }
//
//    public void setHarga(int harga) {
//        this.harga = harga;
//    }
    
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
