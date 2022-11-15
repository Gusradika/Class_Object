package praktikum;

abstract public class manusia {
    static double tinggiBadan = 160;
    static double bb = 160;

    public manusia(double tinggiBadan, double bb) {
        this.tinggiBadan = tinggiBadan;
        this.bb = bb;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }

    abstract double bmi();

    abstract String hitungBmi();

    abstract double htgBB();

    abstract int umur();
}
