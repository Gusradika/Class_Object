package object2;

import java.io.*;

public class main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            // Menu
            do {
                System.out.println("--- PBO CELL ---");
                System.out.println("[1]. Isi data HP");
                System.out.println("[2]. Beli HP");
                System.out.println("[3]. Keluar Aplikasi");
                System.out.print("Pilih menu : ");
                int input = Integer.parseInt(br.readLine());

                switch (input) {
                    case 1:

                        break;

                    case 2:

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
