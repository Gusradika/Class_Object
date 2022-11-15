package tugas9;

import java.io.*;

public class main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static sistemToko toko = new sistemToko();
    static sistemToko mnmn = new minuman();
    static sistemToko smbko = new sembako();

    public static void main(String[] args) throws IOException {
        cache();
        menu();
    }

    public static void menu() throws IOException {
        do {
            int input = 0;
            main.cetakSpasi(2);
            System.out.println("--- Toko Maju Bersama ---");
            System.out.println("I Gusti Ngurah Aditya Kesuma - 21410100039");
            System.out.println("[1]. Cek Barang");
            System.out.println("[2]. Tambah Barang");
            System.out.println("[3]. Penjualan");
            System.out.println("[4]. Exit");
            System.out.print("Masukan Inputan : ");
            input = Integer.parseInt(br.readLine());
            switch (input) {
                case 1:
                    System.out.println("--- Cetak Barang ---");
                    System.out.println("[1]. Sembako");
                    System.out.println("[2]. Minuman");
                    System.out.println("[3]. Exit");
                    System.out.print("Masukan Inputan : ");
                    input = Integer.parseInt(br.readLine());
                    if (!(input < 0) && !(input > 4)) {
                        if (input == 1) {
                            smbko.cekBarang();
                        }
                        if (input == 2) {
                            mnmn.cekBarang();
                        }
                        if (input == 3) {
                            menu();
                        }
                    }

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static void cetakSpasi(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println();
        }
    }

    public static void cache() {
        String[] cBarang = { "Kopi", "Beras", "Gula", "Minyak" };
        int[] cHarga = { 2000, 6500, 8000, 12000 };
        int[] cStok = { 20, 13, 8, 12 };
        String[] c2Barang = { "Cola", "Pepsi", "Fanta", "Milo" };
        int[] c2Harga = { 4000, 4000, 4500, 6000 };
        int[] c2Stok = { 20, 13, 8, 12 };

        for (int i = 0; i < cBarang.length; i++) {
            sembako.barang.add(cBarang[i]);
            sembako.harga.add(cHarga[i]);
            sembako.stok.add(cStok[i]);
        }
        for (int i = 0; i < cStok.length; i++) {
            mnmn.barang.add(c2Barang[i]);
            mnmn.harga.add(c2Harga[i]);
            mnmn.stok.add(c2Stok[i]);

        }
    }

    // Vector<String> barang = new Vector<String>();
    // Vector<Integer> harga = new Vector<Integer>();
    // Vector<Integer> stok = new Vector<Integer>();
}