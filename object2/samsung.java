package object2;

public class samsung {
    int harga, jumlah, total;

    // setter
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // getter

    public int getHarga() {
        return this.harga;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    // custom

    public int beli() {
        total = getHarga() * getJumlah();
        return total;
    }
}
