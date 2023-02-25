package TugasOOP;

public class Segitiga extends BangunDatar{
    double tinggi, alas, sisi1, sisi2, sisi3;
    public Segitiga(double tinggi, double alas, double sisi1, double sisi2, double sisi3){
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public double hitungluas(){
        return (alas*tinggi)/2;
    }

    public double hitungkeliling(){
        return sisi1+sisi2+sisi3;
    }
}
