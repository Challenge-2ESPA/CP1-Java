import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        System.out.println("\n======================");
        System.out.println("Contagem regressiva");
        System.out.println("======================\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();

        System.out.println("\n---------- Contagem ----------");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        System.out.println("\nFim do programa!");
    }
}
