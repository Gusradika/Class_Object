package praktikum;

public class perempuan extends manusia {

    @Override
    int umur() {
        // TODO Auto-generated method stub
        return 0;
    }

    public perempuan(double tinggiBadan) {
        // TODO Auto-generated method stub
        super(tinggiBadan);
    }

    @Override
    double htgBB() {
        // TODO Auto-generated method stub
        return (tinggiBadan - 100) * 0.8;
    }
}
