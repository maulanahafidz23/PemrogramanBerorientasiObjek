package postest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class main {
    private static ArrayList <Pembeli> dataPembeli = new ArrayList <>();
    private static ArrayList <Penjual> dataPenjual = new ArrayList <>();
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

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

            System.out.print("\nPilih menu (1-5)    : ");
            String pilihan = input.readLine();

            switch (pilihan) {
                case "1":
                    System.out.println("\n----- Menu Tambah Data -----");
                    System.out.println("1. Tambah Data Penjual ");
                    System.out.println("2. Tambah data Pembeli ");
                    System.out.print("Pilih menu  : ");
                    int pilihTambah = Integer.parseInt(input.readLine());
                    switch (pilihTambah) {
                        case 1 :
                            tambahPenjual();
                            break;
                        case 2 :
                            tambahPembeli();
                            break;
                    }
                    break;
                case "2":
                    System.out.println("\n----- Menu Tampilkan Data -----");
                    System.out.println("1. Tampilkan Data Penjual ");
                    System.out.println("2. Tampilkan data Pembeli ");
                    System.out.print("Pilih menu    : ");
                    int pilihTampil = Integer.parseInt(input.readLine());
                    switch (pilihTampil) {
                        case 1:
                            tampilkanPenjual();
                            break;
                        case 2:
                            tampilkanPembeli();
                            break;
                    }        
                    break;
                case "3":
                    System.out.println("\n----- Menu Hapus Data -----");
                    System.out.println("1. Hapus Data Penjual ");
                    System.out.println("2. Hapus data Pembeli ");
                    System.out.print("Pilih Menu    : ");
                    int pilihHapus = Integer.parseInt(input.readLine());
                    switch (pilihHapus) {
                        case 1:
                            hapusPenjual();
                            break;
                        case 2:
                            hapusPembeli();
                            break;
                    }        
                    break;
                case "4":
                    System.out.println("\n----- Menu Update Data -----");
                    System.out.println("1. UPdate Data Penjual ");
                    System.out.println("2. Update data Pembeli ");
                    System.out.print("Pilih menu    : ");
                    int pilihUbah = Integer.parseInt(input.readLine());
                    switch (pilihUbah) {
                        case 1:
                            ubahPenjual();
                            break;
                        case 2:
                            ubahPembeli();
                            break;
                    }        
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.err.println("Pilihan tidak tersedia \nSilahkan Input angka 1-5 ");
            }
            System.out.print("Apakah Anda Ingin Melanjutkan (y/n)? : ");
            pilihan = input.readLine();
            lanjutkan = pilihan.equalsIgnoreCase("y");
        }
    }

    
    
    
    
    //---------- TAMBAH DATA ----------
    private static void tambahPenjual() throws IOException {
        System.out.print("Nama penjual      : ");
        String penjual = input.readLine();
        
        System.out.print("Kondisi           : ");
        String kondisi = input.readLine();
        
        System.out.print("Merk              : ");
        String merk = input.readLine();
        
        System.out.print("Type              : ");
        String type = input.readLine();
        
        System.out.print("Warna             : ");
        String warna = input.readLine();

        System.out.print("Tahun             : ");
        int tahun = Integer.parseInt(input.readLine());
        
        System.out.print("Harga             : Rp. ");
        int harga = Integer.parseInt(input.readLine());
        
        Penjual jual = new Penjual (penjual, kondisi, merk, type, warna, tahun, harga);
        dataPenjual.add(jual);

        System.out.println("\n Data berhasil ditambahkan.");
    }
    
    
    
    private static void tambahPembeli() throws IOException {
        System.out.print("Nama Pembeli      : ");
        String pembeli = input.readLine();
        
        System.out.print("Nomor Telpon      : ");
        int nomor = Integer.parseInt(input.readLine());
        
        System.out.print("Merk              : ");
        String merk = input.readLine();
        
        System.out.print("Type              : ");
        String type = input.readLine();
        
        System.out.print("Warna             : ");
        String warna = input.readLine();

        System.out.print("Tahun             : ");
        int tahun = Integer.parseInt(input.readLine());
        
        System.out.print("Harga             : Rp. ");
        int harga = Integer.parseInt(input.readLine());
        
        Pembeli mobil = new Pembeli(pembeli, nomor, merk, type, warna, tahun, harga);
        dataPembeli.add(mobil);

        System.out.println("\n Data berhasil ditambahkan.");
    }

    
    
    
    
    //---------- MENAMPILKAN DATA ----------
    private static void tampilkanPenjual() {
        System.out.println("\n--------- DATA PENJUAL MOBIL ----------");

        if (dataPenjual.size() == 0) {
            System.out.println("Data Penjual Kosong");
        } else {
            for (int i = 0; i < dataPenjual.size(); i += 1) {
                System.out.println("Nomor              " + (i + 1));
                System.out.println("Nama Penjual     : " + dataPenjual.get(i).getNama());
                System.out.println("Merk             : " + dataPenjual.get(i).getMerk());
                System.out.println("Type             : " + dataPenjual.get(i).getType());
                System.out.println("Warna            : " + dataPenjual.get(i).getWarna());
                System.out.println("Tahun            : " + dataPenjual.get(i).getTahun());
                System.out.println("Harga            : Rp. " + dataPenjual.get(i).getHarga());
                System.out.println("Kondisi          : " + dataPenjual.get(i).getKondisi());
                System.out.println("========================================================");
            }
        }
    }
    
    
    
    private static void tampilkanPembeli() {
        System.out.println("\n--------- DATA PEMBELI MOBIL ----------");

        if (dataPembeli.size() == 0) {
            System.out.println("Data Pembeli Kosong");
        } else {
            for (int i = 0; i < dataPembeli.size(); i += 1) {
                System.out.println("Nomor              " + (i + 1));
                System.out.println("Nama Pembeli     : " + dataPembeli.get(i).getNama());
                System.out.println("Nomor Telpon     : " + dataPembeli.get(i).getNomor());
                System.out.println("Merk             : " + dataPembeli.get(i).getMerk());
                System.out.println("Type             : " + dataPembeli.get(i).getType());
                System.out.println("Warna            : " + dataPembeli.get(i).getWarna());
                System.out.println("Tahun            : " + dataPembeli.get(i).getTahun());
                System.out.println("Harga            : Rp.  " + dataPembeli.get(i).getHarga());
                System.out.println("========================================================");
            }
        }
    }
    
    
    
    
    

    //---------- UPDATE DATA -----------
    
    private static void ubahPenjual() throws IOException {
        tampilkanPenjual();

        if (dataPenjual.size() == 0) {
            return;
        }

        System.out.print("\nPilih nomor data yang akan diubah: ");
        int nomor = Integer.parseInt(input.readLine());

        if (nomor < 1 || nomor > dataPenjual.size()) {
            System.out.println("Nomor data tidak valid.");
            return;
        }

        Penjual jual = dataPenjual.get(nomor-1);
        
        System.out.print("Nama Penjual (" + jual.getNama() + ") :");
        String penjual = input.readLine();
        
        System.out.print("Kondisi (" + jual.getKondisi() + ")   :");
        String kondisi = input.readLine();
        
        System.out.print("Merk (" + jual.getMerk() + ")         : ");
        String merk = input.readLine();
        
        System.out.print("Type (" + jual.getType() + ")         : ");
        String type = input.readLine();
        
        System.out.print("Tahun (" + jual.getTahun() + ")       : ");
        int tahun = Integer.parseInt(input.readLine());
        
        System.out.print("Warna (" + jual.getWarna() + ")       : ");
        String warna = input.readLine();
        
        System.out.print("Harga (" + jual.getHarga() + ")       : Rp. ");
        int harga = Integer.parseInt(input.readLine());
        
        jual.setNama(penjual);
        jual.setKondisi(kondisi);
        jual.setMerk(merk);
        jual.setType(type);
        jual.setTahun(tahun);
        jual.setWarna(warna);
        jual.setHarga(harga);

        System.out.println("\nData mobil berhasil diubah.");
    }
    
    
    
    private static void ubahPembeli() throws IOException {
        tampilkanPembeli();

        if (dataPembeli.size() == 0) {
            return;
        }

        System.out.print("\nPilih nomor data yang akan diubah: ");
        int nomor = Integer.parseInt(input.readLine());

        if (nomor < 1 || nomor > dataPembeli.size()) {
            System.out.println("Nomor data tidak valid.");
            return;
        }

        Pembeli mobil = dataPembeli.get(nomor-1);
        
        System.out.print("Nama Pembeli (" + mobil.getNama() + ")    :");
        String penjual = input.readLine();
        
        System.out.print("Nomor Telpon (" + mobil.getNomor() + ")   :");
        int nomorTelp = Integer.parseInt(input.readLine());
        
        System.out.print("Merk (" + mobil.getMerk() + ")            : ");
        String merk = input.readLine();
        
        System.out.print("Type (" + mobil.getType() + ")            : ");
        String type = input.readLine();
        
        System.out.print("Tahun (" + mobil.getTahun() + ")          : ");
        int tahun = Integer.parseInt(input.readLine());
        
        System.out.print("Warna (" + mobil.getWarna() + ")          : ");
        String warna = input.readLine();
        
        System.out.print("Harga (" + mobil.getHarga() + ")          : Rp. ");
        int harga = Integer.parseInt(input.readLine());
        
        mobil.setNama(penjual);
        mobil.setNomor(nomorTelp);
        mobil.setMerk(merk);
        mobil.setType(type);
        mobil.setTahun(tahun);
        mobil.setWarna(warna);
        mobil.setHarga(harga);

        System.out.println("\nData mobil berhasil diubah.");
    }
    
    
    
    
    
    //----------- HAPUS DATA ----------
    private static void hapusPenjual() throws IOException {
    tampilkanPenjual();

    if (dataPenjual.size() == 0) {
        return;
    }

    System.out.print("\nPilih nomor data yang akan dihapus: ");
    int nomor = Integer.parseInt(input.readLine());

    if (nomor < 1 || nomor > dataPenjual.size()) {
        System.out.println("Nomor data tidak valid.");
        return;
    }

    Mobil barang = dataPenjual.get(nomor-1);
    dataPenjual.remove(barang);

    System.out.println("\nData berhasil dihapus.");
    }
    
    
    
    private static void hapusPembeli() throws IOException {
    tampilkanPembeli();

    if (dataPembeli.size() == 0) {
        return;
    }

    System.out.print("\nPilih nomor data yang akan dihapus: ");
    int nomor = Integer.parseInt(input.readLine());

    if (nomor < 1 || nomor > dataPembeli.size()) {
        System.out.println("Nomor data tidak valid.");
        return;
    }

    Mobil barang = dataPembeli.get(nomor-1);
    dataPembeli.remove(barang);

    System.out.println("\nData berhasil dihapus.");
    }
}