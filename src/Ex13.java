public class Ex13 {
    public static void main(String[] args) {

        Car carro1 = new Car();
        carro1.brand = "BYD";
        carro1.model = "SONG PLUS PREMIUM";
        carro1.year = 2025;

        Car carro2 = new Car();
        carro2.brand = "GWM";
        carro2.model = "H6 GT";
        carro2.year = 2027;

        System.out.println(carro1.brand);
        System.out.println(carro1.model);
        System.out.println(carro1.year);

        System.out.println(carro2.brand);
        System.out.println(carro2.model);
        System.out.println(carro2.year);
    }
}