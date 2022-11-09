package praktikum;

public class laki_laki extends manusia {

    public laki_laki(double tinggiBadan) {
        // TODO Auto-generated method stub
        super(tinggiBadan);
    }

    @Override
    double htgBB() {
        // TODO Auto-generated method stub
        return (tinggiBadan - 100) * 0.9;
    }

    @Override
    int umur() {
        // TODO Auto-generated method stub
        return 0;
    }

}
