package pertemuan_pt4;

public class sub extends super_class {

    private int tinggi;

    public sub(String nama, String keterangan, int tinggi) {
        super(nama, keterangan);
        this.tinggi = tinggi;
    }

    // Getter
    public int getTinggi() {
        return tinggi;
    }

    // custom
    public void dataLengkap() {
        System.out.print(super.getNama() + " " + super.getKeterangan() + " " + getTinggi());
    }

    @Override
    public void cetak() {
        super.cetak();
    }

    @Override
    public void halo() {
        super.halo();
    }
}
