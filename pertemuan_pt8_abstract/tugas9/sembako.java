package tugas9;

import java.io.*;
import java.util.*;

public class sembako extends sistemToko implements toko {

    static Vector<String> barang = new Vector<String>();
    static Vector<Integer> harga = new Vector<Integer>();
    static Vector<Integer> stok = new Vector<Integer>();

    @Override
    public void tambahBarang() {
        // TODO Auto-generated method stub
        try {
            System.out.print("Tambahkan Barang : ");
            barang.add(br.readLine());
        } catch (Exception e) {
            System.err.println(e);
        }
        tambahHarga();
    }

    @Override
    public void tambahHarga() {
        // TODO Auto-generated method stub
        try {
            System.out.print("Tambahkan Harga : ");
            harga.add(Integer.parseInt(br.readLine()));
        } catch (Exception e) {
            System.err.println(e);
        }
        tambahStok();
    }

    @Override
    public void tambahStok() {
        // TODO Auto-generated method stub
        try {
            System.out.print("Tambahkan Stok : ");
            stok.add(Integer.parseInt(br.readLine()));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void beli(int x) {
        main.cetakSpasi(2);
        total = super.harga(x);
    }

    @Override
    public void cetakBarang() throws IOException {
        cekBarang();
        main.cetakSpasi(2);
        int x = Integer.parseInt(br.readLine());
        beli(x);
    }

    public void cekBarang() {
        main.cetakSpasi(2);
        System.out.println("ID\tNama Barang\tStok Kg\tHarga");
        for (int i = 0; i < barang.size(); i++) {
            System.out.println("[" + (i + 1) + "]\t" + barang.get(i) + "\t\t" + stok.get(i) + "\t" + harga.get(i));
        }
    }

}
