import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Escreva o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Seus numeros são: " + num1 + " e " + num2);
        System.out.println("E os números inteiros entre eles são: ");
        for (int i = num1 + 1;i < num2;i++){
            System.out.print(i + " ");
        }
        System.out.println("Fim do programa");
    }
}
