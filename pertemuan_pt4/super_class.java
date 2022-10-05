package pertemuan_pt4;

public class super_class {

    private String nama, keterangan;

    // Constructor

    public super_class(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    // Super

    public void cetak() {
        System.out.print(getNama() + " " + getKeterangan());
    }

    public void halo() {
        System.out.print("Halo!");
    }
}
