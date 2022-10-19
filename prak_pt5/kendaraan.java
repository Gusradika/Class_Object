package prak_pt5;

public class kendaraan {
    // Attributes
    int jumlahBan, kecepatan;
    String nama, bahanBakar;

    public kendaraan(String nama, int jumlahBan, int kecepatan, String bahanBakar) {
        this.jumlahBan = jumlahBan;
        this.kecepatan = kecepatan;
        this.bahanBakar = bahanBakar;
        this.nama = nama;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public int getJumlahBan() {
        return jumlahBan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public String getNama() {
        return nama;
    }
}
