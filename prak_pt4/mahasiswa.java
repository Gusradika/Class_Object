package prak_pt4;

public class mahasiswa {
    // Attribute
    String nim, nama;
    int id;

    public mahasiswa() {
        nim = null;
        nama = null;
    }

    public mahasiswa(int id, String nim, String nama) {
        this.id = id;
        this.nim = nim;
        this.nama = nama;
    }

    // setter

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

}
