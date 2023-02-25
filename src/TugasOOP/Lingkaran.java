package TugasOOP;

public class Lingkaran extends BangunDatar{
    double jari;
    double phi = 3.14;

    public Lingkaran(double jari){
        this.jari = jari;
    }

    @Override
    public double hitungluas(){
        return (double) (phi*jari*jari);
    }

    public double hitungkeliling(){
        return (double) (2*phi*jari);
    }
}
