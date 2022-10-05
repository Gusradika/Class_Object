package prak_pt4;

public class prodi extends mahasiswa {
    // Attribute
    String jurusan, department;
    int semester;

    public prodi(int id, String nim, String nama, int semester) {
        super(id, nim, nama);
        this.jurusan = jurusan;
        this.department = department;
        this.semester = semester;
    }

    // Setter
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void semester(int semester) {
        this.semester = semester;
    }

    // getter
    public String getJurusan() {
        return jurusan;
    }

    public String getDepartment() {
        return department;
    }

    public int getSemester() {
        return semester;
    }

    // custom

    // Get data
    public void getDataProdi() {
        System.out.println("#### Program Studi ####");
        System.out.println("ID\t: " + super.getId());
        System.out.println("Nama\t: " + super.getNama());
        System.out.println("NIM\t: " + super.getNim());
        System.out.println("Department\t: " + getDepartment());
        System.out.println("Jurusan\t: " + getJurusan());
        System.out.println("Semester\t: " + getSemester());

    }

}
