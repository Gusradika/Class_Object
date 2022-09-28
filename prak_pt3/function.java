package prak_pt3;

public class function {
    // Atribut
    String nama, nim, alamat, jurusan, universitas;
    int semester;

    public function() {
        this.nama = "XXXX";
        this.nim = "XXXX";
        this.alamat = "XXXX";
        this.jurusan = "XXXX";
        this.semester = 1;
        this.universitas = "XXXX";
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Getter

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public int getSemester() {
        return this.semester;
    }

    public String getUniversitas() {
        return this.universitas;
    }

    // Print Custom Method

    public String printLabel() {
        String x = "Halo nama saya " + getNama() + " alamat saya di " + getAlamat() + " saya berkuliah di "
                + getUniversitas() + " dengan jurusan " + getJurusan() + " semester " + getSemester();
        return x;
    }

    // params
    // Nama, Nim, alamat, Jurusan, Semester (int), Universitas
    public function(String nama, String nim, String alamat, String jurusan, int semester, String universitas) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.jurusan = jurusan;
        this.semester = semester;
        this.universitas = universitas;
    }

}
