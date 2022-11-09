package Interface;

public class persegi extends superBentuk implements shape {

    @Override
    public void cetak() {
        // TODO Auto-generated method stub

    }

    @Override
    public double luas() {
        // TODO Auto-generated method stub
        super.sisi = 5;
        return super.sisi * super.sisi;
    }

    @Override
    public double keliling() {
        // TODO Auto-generated method stub
        return 0;
    }

}
