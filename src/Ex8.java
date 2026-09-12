import java.util.Scanner;

public class Ex8 {
    static void main(String[] args) {
        System.out.println("\n==================");
        System.out.println("Calculadora de IMC");
        System.out.println("==================\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        Float altura = sc.nextFloat();

        System.out.println("Digite seu peso:");
        Float peso = sc.nextFloat();

        Float imc = peso/(altura*altura);

        ;
        System.out.println("    • Abaixo de 18,5 → Abaixo do peso\n" +
                "    • 18,5 até 24,9 → Peso normal\n" +
                "    • 25 até 29,9 → Sobrepeso\n" +
                "    • 30 ou mais → Obesidade");


        if (imc > 30) {
            System.out.println("Obeso, seu IMC é: " + imc);
        } else if (imc >= 25) {
            System.out.println("Sobrepeso, seu IMC é: " + imc);
        } else if (imc >= 18.5) {
            System.out.println("Peso normal, seu IMC é: " + imc);
        } else {
            System.out.println("Abaixo do peso, seu IMC é: " + imc);
        }

    }
}
