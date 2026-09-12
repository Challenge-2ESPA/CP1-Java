import java.util.Scanner;

public class Ex14 {

    static double converterParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static void main(String[] args) {
        System.out.println("\n==========================");
        System.out.println("Conversor de temperatura");
        System.out.println("Fahrenheit para Celsius");
        System.out.println("==========================\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = sc.nextDouble();

        System.out.println("\n---------- Resultado ----------");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Celsius: " + converterParaCelsius(fahrenheit) + " °C");
        System.out.println("-------------------------------");
        System.out.println("\nFim do programa!");
    }
}
