package TugasOOP;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangundatar = new BangunDatar();
        Persegi persegi = new Persegi(7);
        PersegiPanjang persegipanjang= new PersegiPanjang(5, 12);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga (10,5,4, 9, 2);


        System.out.println("Luas persegi : " + persegi.hitungluas());
        System.out.println("Keliling persegi : "+ persegi.hitungkeliling());
        System.out.println("Luas Persegi panjang : " + persegipanjang.hitungluas());
        System.out.println("Keliling Persegi panjang : " + persegipanjang.hitungkeliling());
        System.out.println("Luas segitiga : " + segitiga.hitungluas());
        System.out.println("Keliling segitiga : " + segitiga.hitungkeliling());
        System.out.println("Luas lingkaran : " + lingkaran.hitungluas());
        System.out.println("Keliling lingkaran : " + lingkaran.hitungkeliling());
    }
}
