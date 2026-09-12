import java.util.Scanner;

public class Ex7 {

    static int maior(int a, int b){
        if(a > b) return a;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println("O maior e: " + maior(n1, n2));
    }
}