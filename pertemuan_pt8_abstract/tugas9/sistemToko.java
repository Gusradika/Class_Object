package tugas9;

import java.io.*;
import java.util.*;

public class sistemToko implements toko {

    protected BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Vector<String> barang = new Vector<String>();
    static Vector<Integer> harga = new Vector<Integer>();
    static Vector<Integer> stok = new Vector<Integer>();
    int count = 0;
    int pilih = 0;
    int jumlah = 0;
    int total = 0;
    // public Object barang;

    @Override
    public void tambahBarang() {
        // TODO Auto-generated method stub
        try {
            System.out.print("Tambahkan Barang : ");
            // barang.add(br.readLine());
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
            // harga.add(Integer.parseInt(br.readLine()));
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
            // stok.add(Integer.parseInt(br.readLine()));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void cetak() {
        // TODO Auto-generated method stub

    }

    @Override
    public int harga(int x) {
        // return harga.get(x) * jumlah;
        return 0;
    }

    // Beli
    @Override
    public void beli(int x) {
        System.out.println();
        total = harga(x);
    }

    // Cetak Barang
    @Override
    public void cetakBarang() throws IOException {
        // main.cetakSpasi(2);
        // System.out.println("ID\tNama Barang\tStok\tHarga");
        // for (int i = 0; i < barang.size(); i++) {
        // System.out.println("[" + (i + 1) + "]\t" + barang.get(i) + "\t\t" +
        // stok.get(i) + "\t" + harga.get(i));
        // }
    }

    public void cekBarang() {

    }

}
