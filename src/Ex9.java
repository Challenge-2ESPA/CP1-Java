import java.util.Scanner;

public class Ex9 {
    static void main(String[] args) {
        System.out.println("Calculadora de media de 3 números");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º número:");
        Float n1 = sc.nextFloat();

        System.out.println("Digite o 2º número:");
        Float n2 = sc.nextFloat();

        System.out.println("Digite o 3º número:");
        Float n3 = sc.nextFloat();

        System.out.println("A média dos números é: "+ calculaMedia(n1, n2, n3));
    }

    static Float calculaMedia(Float x, Float y, Float z){
        return (x + y + z)/3;
    }
}
