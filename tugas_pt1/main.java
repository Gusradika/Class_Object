package tugas_pt1;

import java.io.*;

public class main {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int input = 0, ulang = 0;
        undika kampus = new undika();
        karyawan employee = new karyawan();
        mahasiswa mhs = new mahasiswa();

        try {
            do {
                // cetak spasi
                for (int i = 0; i < 5; i++) {
                    System.out.println();
                }
                if (ulang == 1) {
                    System.out.println("--Inputan Salah! [Try Again]--");
                    System.out.println();
                }
                System.out.println("#### Tugas PT 1 PBO ####");
                System.out.println("I Gusti Ngurah Aditya Kesuma - 21410100039");
                System.out.println();
                System.out.println("*** MENU ***");
                System.out.println("[1]. Cek SPP Mahasiswa");
                System.out.println("[2]. Cek Gaji Karyawan");
                System.out.println("[3]. Keluar Aplikasi");
                System.out.print("Pilih menu: ");
                input = Integer.parseInt(rd.readLine());
                for (int i = 0; i < 2; i++) {
                    System.out.println();
                }

                // Switch Case
                switch (input) {
                    case 1:
                        System.out.println("####### INPUT DATA #######");
                        System.out.print("Nama\t\t: ");
                        kampus.setNama(rd.readLine());
                        System.out.print("Alamat\t\t: ");
                        kampus.setAlamat(rd.readLine());
                        System.out.print("NIM\t\t: ");
                        mhs.setNim(rd.readLine());
                        System.out.print("Prodi\t\t: ");
                        mhs.setProdi(rd.readLine());
                        System.out.print("Angkatan\t: ");
                        mhs.setAngkatan(Integer.parseInt(rd.readLine()));
                        mhs.setSPP();
                        System.out.print("Semester\t: ");
                        mhs.setSemester(Integer.parseInt(rd.readLine()));

                        // cetak spasi
                        for (int i = 0; i < 2; i++) {
                            System.out.println();
                        }
                        System.out.println("#### SPP Mahasiswa ####");
                        System.out.println("Nama\t\t: " + kampus.getNama());
                        System.out.println("Alamat\t\t: " + kampus.getAlamat());
                        System.out.println("NIM\t\t: " + mhs.getNim());
                        System.out.println("Prodi\t\t: " + mhs.getProdi());
                        System.out.println("Angkatan\t: " + mhs.getAngkatan());
                        System.out.println("Semester\t: " + mhs.getSemester());
                        System.out.println("SPP\t\t: Rp " + mhs.getSPP());
                        System.out.println("################");
                        break;

                    case 2:
                        System.out.println("####### INPUT DATA #######");
                        System.out.print("Nama\t\t: ");
                        kampus.setNama(rd.readLine());
                        System.out.print("Alamat\t\t: ");
                        kampus.setAlamat(rd.readLine());
                        System.out.print("NIK\t\t: ");
                        employee.setNIK(rd.readLine());
                        System.out.print("Bagian\t\t: ");
                        employee.setBagian(rd.readLine());
                        System.out.print("Kehadiran\t: ");
                        employee.setKehadiran(Integer.parseInt(rd.readLine()));
                        System.out.print("Gaji per hari\t: ");
                        employee.setGaji(Integer.parseInt(rd.readLine()));

                        // Cetak spasi
                        for (int i = 0; i < 2; i++) {
                            System.out.println();
                        }
                        System.out.println("####### Gaji Karyawan #######");
                        System.out.println("Nama\t\t: " + kampus.getNama());
                        System.out.println("Alamat\t\t: " + kampus.getAlamat());
                        System.out.println("NIK\t\t: " + employee.getNIK());
                        System.out.println("Bagian\t\t: " + employee.getBagian());
                        System.out.println("Kehadiran\t: " + employee.getKehadiran());
                        System.out.println("Gaji per hari\t: " + employee.getGPH());
                        System.out.println("Total gaji\t: " + employee.getGaji());
                        System.out.println("################");
                        break;

                    case 3:
                        System.exit(0);
                        break;

                    default:
                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Error! inputan salah!");
        }
    }
}