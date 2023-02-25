package TugasOOP;

public class PersegiPanjang  extends BangunDatar{
    double lebar, panjang;

    public PersegiPanjang(double lebar, double panjang){
        this.lebar = lebar;
        this.panjang = panjang;
    }

    @Override
    public double hitungluas(){
        return (double) (panjang*lebar);
    }

    @Override
    public double hitungkeliling(){
        return (double) (2*panjang+lebar);
    }
}
