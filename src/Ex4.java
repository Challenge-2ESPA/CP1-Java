import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva um numero que deseja ser fatorado: ");
        int resposta = sc.nextInt();
        int acumulador = 1;
        if (resposta == 1 || resposta == 0) {
            System.out.println("Não existe fatoração desse numero, o resultado é ele mesmo");
        } else {
            for (int i = resposta ; i > 1; i--) {
                acumulador = acumulador * i;
                System.out.println("O fatorial é: " + acumulador + " x " + (i - 1) + " = " + acumulador);
            }
            System.out.println("A fatoração do número " + resposta + " é " + acumulador );
        }
        System.out.println("Fim do Programa");
    }
}
