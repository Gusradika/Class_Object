package praktikum;

public class laki_laki extends manusia {

    double bmi;

    public laki_laki(double tinggiBadan, double bb) {
        // TODO Auto-generated method stub
        super(tinggiBadan, bb);
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

    @Override
    double bmi() {
        // TODO Auto-generated method stub
        return bb / ((tinggiBadan / 100) * 2);
    }

    @Override
    String hitungBmi() {
        String x = "";
        bmi = bmi();
        // TODO Auto-generated method stub
        if (bmi < 18.4) {
            x = "Berat Badan Kurang";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            x = "Berat Badan Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            x = "Berat Badan Berlebih";
        } else {
            x = "Berat Badan Obesitas";
        }
        return x;
    }

}
