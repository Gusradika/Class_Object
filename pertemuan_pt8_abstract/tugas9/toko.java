package tugas9;

import java.io.IOException;

public interface toko {

    public void tambahBarang();

    public void tambahHarga();

    public void tambahStok();

    public int harga(int x);

    public void cetak();

    public void beliBarang() throws IOException;

    public int operasiHitung(int x, int y);

    public int operasiHitungTotal();

    public void cekBarang();

    public void invoice();

}
