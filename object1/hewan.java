package object1;

public class hewan {
    public hewan() {
        // attributes

    }

    private String tipe, suara;
    private int usia;

    // setter dari semua variable attribute/data
    // setter selalu memiliki parameter
    public void setTipe(String t) {
        tipe = t;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    // getter dari semua variable attribute/data
    // getter tidak memiliki parameter
    // karena langsung mengambil data dari setter.

    public String getTipe() {

        return this.tipe;
    }

    public String getSuara() {
        return this.suara;
    }

    public int getUsia() {
        return this.usia;
    }
}
