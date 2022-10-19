package prak_pt5;

public class sepeda extends kendaraan {
    public sepeda(String nama, int jumlahBan, int kecepatan, String bahanBakar) {
        super(nama, jumlahBan, kecepatan, bahanBakar);
        this.bahanBakar = bahanBakar;
        this.jumlahBan = jumlahBan;
        this.kecepatan = kecepatan;
        this.nama = nama;
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
