import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0, impares = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º numero");
            int num = sc.nextInt();

            if(num % 2 == 0)
                pares++;
            else
                impares++;
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}