package prak_pt3;

import java.io.IOException;

public class main {

    // Nama, Nim, alamat, Jurusan, Semester (int), Universitas
    public static void main(String[] args) throws IOException {
        cetakSpasi(2);
        function x = new function("Aditya Kesuma", "21410100039", "Sidoarjo", "S1 Sistem Informasi", 3,
                "Universitas Dinamika");

        System.out.println(x.printLabel());
    }

    public static void cetakSpasi(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println();
        }
    }
}
