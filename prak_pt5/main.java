package prak_pt5;

public class main {
    public static void main(String[] args) {
        kendaraan mobil = new mobil("Avanza", 4, 300, "Bensin");
        kendaraan motor = new motor("Supra X", 2, 120, "Bensin");
        kendaraan sepeda = new sepeda("Wim Cycle", 2, 10, "Manual");

        cetakSpasi(2);
        System.out.println("Nama : " + mobil.getNama());
        System.out.println("Jumlah Ban : " + mobil.getJumlahBan());
        System.out.println("Kecepatan : " + mobil.getKecepatan());
        System.out.println("Bahan Bakar : " + mobil.getBahanBakar());

        cetakSpasi(2);
        System.out.println("Nama : " + motor.getNama());
        System.out.println("Jumlah Ban : " + motor.getJumlahBan());
        System.out.println("Kecepatan : " + motor.getKecepatan());
        System.out.println("Bahan Bakar : " + motor.getBahanBakar());

        cetakSpasi(2);
        System.out.println("Nama : " + sepeda.getNama());
        System.out.println("Jumlah Ban : " + sepeda.getJumlahBan());
        System.out.println("Kecepatan : " + sepeda.getKecepatan());
        System.out.println("Bahan Bakar : " + sepeda.getBahanBakar());
        cetakSpasi(4);
    }

    public static void cetakSpasi(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println();
        }
    }
}