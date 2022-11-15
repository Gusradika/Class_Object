package tugas9;

import java.io.*;
import java.util.*;

public class sembako extends sistemToko implements toko {

    @Override
    public void tambahBarang() {
        // TODO Auto-generated method stub
        try {
            main.cetakSpasi(2);
            System.out.println("--- Menu Tambah Barang ---");
            System.out.print("Tambahkan Barang : ");
            barang.add(br.readLine());
            id.add(id.size() + 1);
            System.out.print("Harga Barang : ");
            harga.add(Integer.parseInt(br.readLine()));
            System.out.print("Stok Barang : ");
            stok.add(Integer.parseInt(br.readLine()));
            identifier.add(1);
            main.cetakSpasi(1);
            System.out.println("Barang berhasil ditambahkan");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    // JumlahBeli, id barang yang dibeli
    @Override
    public int operasiHitung(int x, int y) {
        return super.operasiHitung(x, y);
    }

    @Override
    public int operasiHitungTotal() {

        int x = 0;

        for (int i = 0; i < keranjang.size(); i++) {
            x += totalSatuan.get(i);
        }

        return x;
    }

    @Override
    public void beliBarang() throws IOException {
        cekBarang();
        main.cetakSpasi(2);
        int y = 0;
        System.out.print("Masukan id Barang [0 = Back] : ");
        int x = Integer.parseInt(br.readLine());
        if (x == 0) {
            main.menu();
        }

        if (!(x > barang.size())) {
            for (int j = 0; j < barang.size(); j++) {
                if (identifier.get(j) == 1) {
                    y++;
                    if ((y) == x) {

                        System.out.println(barang.get(j) + " Stok : " + stok.get(j) + " Harga : " + harga.get(j));

                        System.out.print("Masukan Jumlah beli [0 = Back]: ");
                        int z = 0;
                        z = Integer.parseInt(br.readLine());
                        if (z == 0) {
                            main.menu();
                        } else if (!(z > stok.get(j)) && !(z < 0)) {
                            stok.set(j, stok.get(j) - z);
                            keranjang.add(barang.get(j));
                            jumlahBeli.add(z);
                            totalSatuan.add(operasiHitung(z, j));
                            idBarangdiBeli.add(j);
                        }
                        main.cetakSpasi(1);
                        System.out.print("beli Lagi ? : [1 = Ya | 2 = Tidak] : ");
                        z = Integer.parseInt(br.readLine());
                        if (z == 1) {
                            beliBarang();
                        } else {
                            invoice();
                        }
                    }
                }
            }
        } else {
            main.cetakSpasi(2);
            System.err.println("Barang tidak di temukan!");
            clearCache();
            main.menu();
        }
    }

    @Override
    public void invoice() {
        main.cetakSpasi(4);
        int total = operasiHitungTotal();
        System.out.println("Barang yang di beli : ");
        main.cetakSpasi(1);
        System.out.println("//////////////////////////////////");
        for (int i = 0; i < keranjang.size(); i++) {
            System.out.println("[ " + (i + 1) + "] " + keranjang.get(i) + "\tx" + jumlahBeli.get(i) + " @"
                    + harga.get(idBarangdiBeli.get(i)) + " | " + totalSatuan.get(i));
        }
        System.out.println("\t\t\t\tTotal : " + total);
        System.out.println("-----------------------------------");
        main.cetakSpasi(3);
        System.out.print("Transaksi ulang? [1 = Ya | 2 = Tidak]");
        try {
            main.input = Integer.parseInt(main.br.readLine());
            if (main.input == 1) {
                clearCache();
                main.menu();
            } else {
                main.cetakSpasi(2);
                System.out.println("Exiting...");
                System.exit(0);
            }
        } catch (Exception e) {
            clearCache();
        }
    }

    @Override
    public void cekBarang() {
        main.cetakSpasi(2);

        System.out.println("ID\tNama Barang\tStok\tHarga");
        int j = 0;
        for (int i = 0; i < barang.size(); i++) {
            if (identifier.get(i) == 1) {
                System.out.println("[" + (j + 1) + "]\t" + barang.get(i) + "\t\t" + stok.get(i) + "\t" + harga.get(i));
                j++;
            }
        }
    }
}
