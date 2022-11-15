package tugas9;

import java.io.IOException;

public interface toko {

    public void tambahBarang();

    public void tambahHarga();

    public void tambahStok();

    public int harga(int x);

    public void cetak();

    public void cetakBarang() throws IOException;

    public void beli(int x);

}
