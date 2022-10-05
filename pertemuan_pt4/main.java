package pertemuan_pt4;

import java.io.*;

public class main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sub x = new sub("Aditya Kesuma", "Inheritance", 22);

        // Input data
        try {
            System.out.print("Isi Nama : ");
            String n = br.readLine();
            System.out.print("Isi Keterangan : ");
            String k = br.readLine();
            System.out.print("Isi Tinggi : ");
            int t = Integer.parseInt(br.readLine());
            System.out.print("Isi Tinggi : ");

            // Masukan parameter ke dalam Object
            x = new sub(n, k, t);

            // Cetak data lengkap
            x.dataLengkap();

        } catch (Exception e) {
            System.err.println("ERROR");
        }

        x.cetak();
        System.out.println();
        x.halo();
    }
}
