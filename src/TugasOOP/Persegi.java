package TugasOOP;

public class Persegi extends BangunDatar{
    double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double hitungluas(){
        return  sisi * sisi;
    }

    @Override
    public double hitungkeliling(){
        return 4 * sisi;
    }
}
