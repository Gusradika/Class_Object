package object1;

public class main {
    public static void main(String[] args) {
        // mengakses kelas hewan burung ikan perlu membuat. object atau instance of
        // class

        // akses suara, tipe dan usia dari class hewan
        hewan burung = new hewan();
        hewan ikan = new hewan();

        // akses method dari class burung dan ikan
        burung b = new burung();
        ikan i = new ikan();

        // cara isi dari suara, tipe, dan usia
        burung.setTipe("Kakak Tua");
        burung.setSuara("kuk... kuk.. kuk...");
        burung.setUsia(1);

        ikan.setTipe("Arwana");
        ikan.setSuara("blurp... blurp... blurp...");
        ikan.setUsia(0);

        // cara ambil dari setter (hewan, ikan dan burung)
        System.out.println(
                "aku " + burung.getTipe() + " Suaraku " + burung.getSuara() + " usiaku " + burung.getUsia() + ".");
        b.terbang();

        System.out.println();

        System.out.println("aku " + ikan.getTipe() + " Suaraku " + ikan.getSuara() + " usiaku " + ikan.getUsia() + ".");
        i.berenang();
    }
}
