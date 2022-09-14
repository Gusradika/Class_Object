package Playground.latihan1;

import java.io.*;

public class main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            cetakSpasi(2);
            System.out.println(" -- Menghitung Rumus bangun datar --");
            System.out.println("[1]. Persegi");
            System.out.println("[2]. Persegi Panjang");
            System.out.println("[3]. Segitiga");
            System.out.println("[4]. Lingkaran");
            System.out.println("[5]. Belah ketupat");
            System.out.println("[6]. Jajar Genjang");
            System.out.println("[7]. exit");
            System.out.print("Masukan Pilihan : ");
            int input = Integer.parseInt(br.readLine());
            switch (input) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Inputan salah!");
        }
    }

    public static void cetakSpasi(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println();
        }
    }
}