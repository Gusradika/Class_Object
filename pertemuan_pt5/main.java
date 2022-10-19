package pertemuan_pt5;

public class main {

    // polimorphisme

    public static void main(String[] args) {
        lingkaran lk = new lingkaran();
        lingkaran lk2 = new lingkaran2();

        System.out.print("luas (Jari-jari) : " + lk.luas(3.0));
        System.out.println("");
        System.out.println("luas (Diameter) : " + lk.luas(3.3f));

        // Cetak dari superclass
        lk.cetak();

        // cetak dari subclass
        lk2.cetak();
    }

}
