package pertemuan_pt5;

public class lingkaran {

    // fungsi luas dengan jari-jari
    public double luas(double jariJari) {
        return (3.14 * jariJari * jariJari);
    }

    // Fungsi luas dengan diameter
    public float luas(float diameter) {
        return (0.25f * 3.14f * diameter * diameter);
    }

    // Overriding method
    // method berjenis Prosedur

    public void cetak() {
        System.out.println("Ini adalah super class");
    }
}
