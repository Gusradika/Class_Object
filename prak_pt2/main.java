package prak_pt2;

import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        nilai x = new nilai();
        nilai y = new nilai();

        // Object
        do {
            System.out.println();
            System.out.println("-- Pilih Rumus Keliling --");
            System.out.println("[1]. persegi");
            System.out.println("[2]. persegi panjang");
            System.out.println("[3]. Exit");
            System.out.print("Pilih menu : ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println();
                    System.out.println("-- Menghitung Persegi --");
                    System.out.print("Masukan nilai sisi : ");
                    x.setX(sc.nextInt());
                    System.out.println("Keliling =" + persegi());
                    break;

                case 2:
                    System.out.println();
                    System.out.println("-- Menghitung Luas Persegi Panjang --");
                    System.out.print("Masukan Panjang : ");
                    y.setX(sc.nextInt());
                    System.out.print("Masukan Lebar : ");
                    y.setY(sc.nextInt());
                    System.out.println("Luas : " + persegiPanjang());
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static int persegi() {
        return nilai.kelilingPersegi();
    }

    public static int persegiPanjang() {
        return nilai.luasPersegiPanjang();
    }
}
