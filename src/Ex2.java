import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade >= 16){
            System.out.println("Parabéns, você possui idade para votar e mudar nosso país");
        } else {
            System.out.println("Você ainda não pode votar!");
        }
        System.out.println("Fim do programa");
    }
}
