package prak_pt4;

import java.io.*;

public class main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input, temp;
        boolean added = false;

        try {
            cetakSpasi(2);
            System.out.println("#### Tambah Data ####");
            System.out.print("Berapa jumlah data yang ingin di tambah : ");
            int jumlah = Integer.parseInt(br.readLine());

            prodi x[] = new prodi[jumlah];
            sskm y[] = new sskm[jumlah];
            int id = 1;

            for (int i = 0; i < jumlah; i++) {
                cetakSpasi(2);
                System.out.println("#### Data ke. " + (i + 1) + " ####");
                System.out.print("Entry NIM : ");
                String nim = br.readLine();
                System.out.print("Entry Nama : ");
                String nama = br.readLine();
                System.out.print("Entry Department : ");
                String dep = br.readLine();
                System.out.print("Entry Jurusan : ");
                String jur = br.readLine();
                System.out.print("Entry Semester : ");
                int sem = Integer.parseInt(br.readLine());
                System.out.print("Entry SSKM : ");
                int sskm = Integer.parseInt(br.readLine());

                //
                x[i] = new prodi(id, nim, nama, sem);
                y[i] = new sskm(id, nim, nama, sskm);

                id++;

            }

            do {
                cetakSpasi(2);
                System.out.println("#### Menu Utama ####");
                System.out.println("[1]. Cetak Data");
                System.out.println("[2]. Tambah SSKM");
                System.out.println("[3]. EXIT");

                input = Integer.parseInt(br.readLine());
                switch (input) {

                    case 1:

                        cetakSpasi(2);
                        System.out.print("ID keberapa yang ingin di tampilkan : 1 - " + jumlah);
                        temp = Integer.parseInt(br.readLine()) - 1;

                        x[temp].getDataProdi();
                        y[temp].getDataSskm();

                        cetakSpasi(2);

                        break;

                    case 2:
                        System.out.print("ID keberapa yang ingin di Ditambahkan : 1 - " + jumlah + " : ");
                        temp = Integer.parseInt(br.readLine());
                        System.out.print("Ingin menambahkan berapa point? : ");
                        int tambah = Integer.parseInt(br.readLine());
                        y[temp - 1].addPoint(tambah);

                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public static void cetakSpasi(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println();
        }
    }
}
