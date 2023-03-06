package Postest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

//-------------------- PROGRAM PENDATAAN STOCK SHOWROOM MOBIL --------------------
class Mobil {
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

    //----------DISPLAY----------
    public String toString () {
        return merk + " | " + type + " | " + tahun + " | " + warna + " |Rp.  " + harga;
    }
}

//----------CLASS UTAMA----------
public class main {
    private static ArrayList<Mobil> daftarMobil = new ArrayList<Mobil>();
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    Scanner trm = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        boolean lanjutkan = true;
        
        while (lanjutkan) {
            System.out.println("SHOWROOM SUKSES MANDIRI JAYA ABADI");
            System.out.println("----------------------------------");
            System.out.println("|              MENU              |");
            System.out.println("----------------------------------");
            System.out.println("| 1. Tambah Data                 |");
            System.out.println("| 2. Tampilkan Data              |");
            System.out.println("| 3. Hapus Data                  |");
            System.out.println("| 4. Update Data                 |");
            System.out.println("| 5. Keluar                      |");
            System.out.println("----------------------------------");

            System.out.print("\nPilih menu (1-5): ");
            String pilihan = input.readLine();

            switch (pilihan) {
                case "1":
                    tambahBarang();
                    break;
                case "2":
                    tampilkanBarang();
                    break;
                case "3":
                    hapusBarang();
                    break;
                case "4":
                    ubahBarang();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.err.println("Pilihan tidak tersedia \nSilahkan Input angka 1-5 ");
            }
            System.out.println("Apakah Anda Ingin Melanjutkan (y/n)?");
            pilihan = input.readLine();
            lanjutkan = pilihan.equalsIgnoreCase("y");
        }
    }

    //---------- TAMBAH DATA ----------
    private static void tambahBarang() throws IOException {
        System.out.print("Merk      : ");
        String merk = input.readLine();
        
        System.out.print("Type      : ");
        String type = input.readLine();
        
        System.out.print("Warna     : ");
        String warna = input.readLine();

        System.out.print("Tahun     : ");
        int tahun = Integer.parseInt(input.readLine());
        
        System.out.print("Harga     : Rp. ");
        int harga = Integer.parseInt(input.readLine());

        Mobil barang = new Mobil(merk, type, warna, tahun, harga);
        daftarMobil.add(barang);

        System.out.println("\n Data berhasil ditambahkan.");
    }

    //---------- MENAMPILKAN DATA ----------
    private static void tampilkanBarang() {
        System.out.println("\n--------- DAFTAR STOCK MOBIL ----------");

        if (daftarMobil.size() == 0) {
            System.out.println("Stock Showroom Kosong");
        } else {
            for (int i = 0; i < daftarMobil.size(); i++) {
                System.out.println((i+1) + ". " + daftarMobil.get(i));
            }
        }
    }

    //---------- UPDATE DATA -----------
    private static void ubahBarang() throws IOException {
        tampilkanBarang();

        if (daftarMobil.size() == 0) {
            return;
        }

        System.out.print("\nPilih nomor data yang akan diubah: ");
        int nomor = Integer.parseInt(input.readLine());

        if (nomor < 1 || nomor > daftarMobil.size()) {
            System.out.println("Nomor data tidak valid.");
            return;
        }

        Mobil barang = daftarMobil.get(nomor-1);
        
        System.out.print("Merk (" + barang.getMerk() + "): ");
        String merk = input.readLine();
        
        System.out.print("Type (" + barang.getType() + "): ");
        String type = input.readLine();
        
        System.out.print("Tahun (" + barang.getTahun() + "): ");
        int tahun = Integer.parseInt(input.readLine());
        
        System.out.print("Warna (" + barang.getWarna() + "): ");
        String warna = input.readLine();
        
        System.out.print("Harga (" + barang.getHarga() + "): ");
        int harga = Integer.parseInt(input.readLine());
        
        barang.setMerk(merk);
        barang.setType(type);
        barang.setTahun(tahun);
        barang.setWarna(warna);
        barang.setHarga(harga);

        System.out.println("\nData mobil berhasil diubah.");
    }
    
    //----------- HAPUS DATA ----------
    private static void hapusBarang() throws IOException {
    tampilkanBarang();

    if (daftarMobil.size() == 0) {
        return;
    }

    System.out.print("\nPilih nomor data yang akan dihapus: ");
    int nomor = Integer.parseInt(input.readLine());

    if (nomor < 1 || nomor > daftarMobil.size()) {
        System.out.println("Nomor data tidak valid.");
        return;
    }

    Mobil barang = daftarMobil.get(nomor-1);
    daftarMobil.remove(barang);

    System.out.println("\nData berhasil dihapus.");
    }
}