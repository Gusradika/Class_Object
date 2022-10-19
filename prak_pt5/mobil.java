package prak_pt5;

public class mobil extends kendaraan {
    public mobil(String nama, int jumlahBan, int kecepatan, String bahanBakar) {
        super(nama, jumlahBan, kecepatan, bahanBakar);
        this.bahanBakar = bahanBakar;
        this.jumlahBan = jumlahBan;
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    @Override
    public String getBahanBakar() {
        // TODO Auto-generated method stub
        return super.getBahanBakar();
    }

    @Override
    public int getJumlahBan() {
        // TODO Auto-generated method stub
        return super.getJumlahBan();
    }

    @Override
    public int getKecepatan() {
        // TODO Auto-generated method stub
        return super.getKecepatan();
    }

    @Override
    public String getNama() {
        // TODO Auto-generated method stub
        return super.getNama();
    }
}
