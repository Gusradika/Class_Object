package tugas_pt2;

public class mahasiswa {
    private String nim,
            prodi;
    private int spp,
            angkatan,
            semester,
            bayar_spp_semester;

    // setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setSPP() {
        if (getAngkatan() > 17) {
            spp = 15000000;
        } else {
            spp = 12000000;
        }
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // getter
    public String getNim() {
        return this.nim;
    }

    public String getProdi() {
        return this.prodi;
    }

    public int getAngkatan() {
        return this.angkatan;
    }

    public int getSemester() {
        return this.semester;
    }

    // custom
    public int getSPP() {
        this.bayar_spp_semester = this.spp * getSemester();
        return this.bayar_spp_semester;
    }
}