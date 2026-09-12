import java.util.Scanner;

public class Ex6 {

    static void tabuada(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de sua escolha para ver a sua tabuada: ");
        int numero = sc.nextInt();
        tabuada(numero);
    }
}