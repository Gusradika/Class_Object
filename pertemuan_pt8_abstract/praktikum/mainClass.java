package praktikum;

import java.io.*;

public class mainClass {

    public static void main(String[] args) throws IOException {
        manusia laki = new laki_laki(0, 0);
        manusia perempuan = new perempuan(0, 0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // System.out.println(laki.htgBB());
        // System.out.println(perempuan.htgBB());

        String input;

        for (int i = 0; i < 2; i++) {
            cetakSpasi(2);
            System.out.println("Pengguna " + (i + 1));
            System.out.print("[L/P] : ");
            input = br.readLine();
            if (input.equalsIgnoreCase("L")) {
                System.out.print("Masukan Tinggi Badan : ");
                laki.tinggiBadan = Integer.parseInt(br.readLine());
                System.out.print("Masukan Berat Badan : ");
                laki.bb = Integer.parseInt(br.readLine());
                cetakSpasi(1);
                System.out.println("Berat badan ideal : " + laki.htgBB());
                System.out.println("BMI Indexs : " + laki.hitungBmi());
            } else if (input.equalsIgnoreCase("P")) {
                System.out.print("Masukan Tinggi Badan : ");
                perempuan.tinggiBadan = Integer.parseInt(br.readLine());
                System.out.print("Masukan Berat Badan : ");
                perempuan.bb = Integer.parseInt(br.readLine());
                cetakSpasi(1);
                System.out.println("Berat badan ideal : " + perempuan.htgBB());
            } else {
                System.out.println("Null");
            }

        }

    }

    public static void cetakSpasi(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println();
        }
    }

}
