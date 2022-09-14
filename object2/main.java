package object2;

import java.io.*;

public class main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        handphone hp = new handphone();
        samsung samsung = new samsung();

        try {

            // Menu
            do {
                System.out.println();
                System.out.println();
                System.out.println("--- PBO CELL ---");
                System.out.println("[1]. Isi data HP");
                System.out.println("[2]. Beli HP");
                System.out.println("[3]. Keluar Aplikasi");
                System.out.print("Pilih menu : ");
                int input = Integer.parseInt(br.readLine());

                switch (input) {
                    case 1:
                        System.out.println();
                        System.out.println("-- Isi Data --");

                        System.out.print("Tipe : ");
                        hp.setTipe(br.readLine());
                        System.out.print("Warna : ");
                        hp.setWarna(br.readLine());
                        System.out.print("Kapasitas : ");
                        hp.setKapasistas(br.readLine());

                        System.out.print("Harga : ");
                        samsung.setHarga(Integer.parseInt(br.readLine()));
                        System.out.println();
                        break;

                    case 2:
                        System.out.println();
                        System.out.println("-- Beli HP --");
                        System.out.print("Jumlah Beli : ");
                        samsung.setJumlah(Integer.parseInt(br.readLine()));
                        System.out.println("Total Bayar : " + samsung.beli());

                        break;

                    case 3:
                        System.exit(0);
                        break;
                }

            } while (true);

        } catch (Exception e) {
            System.out.println("inputan salah / bukan angka");
        }

    }
}
