package praktikum;

abstract public class manusia {
    static double tinggiBadan = 160;

    public manusia(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }

    abstract double htgBB();

    abstract int umur();
}
