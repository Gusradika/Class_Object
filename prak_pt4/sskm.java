package prak_pt4;

public class sskm extends mahasiswa {
    // Attribute
    int point = 0;

    public sskm(int id, String nim, String nama, int point) {
        super(id, nim, nama);
        this.point = point;
    }

    // Getter
    public int getPoint() {
        return point;
    }

    // Custom
    public void addPoint(int x) {
        point += x;
    }

    // Print Point
    public void getDataSskm() {
        System.out.println("Point : " + point);
    }

}
