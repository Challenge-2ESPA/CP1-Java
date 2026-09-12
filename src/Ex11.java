import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args){
        System.out.println("Programa para saber quem tem a maior idade");
        Scanner sc = new Scanner(System.in);
        int maior_Idade = 0;
        String maior_Nome = "";
        for (int i= 0;i<=2;i++){
            System.out.println("Digite o Nome:");
            String nome = sc.nextLine();
            System.out.println("Digite a idade de "+ nome);
            int idade = sc.nextInt();
            sc.nextLine();
            if (idade > maior_Idade){
                maior_Idade = idade;
                maior_Nome = nome;
            }
        }
        System.out.println("Pessoa mais velha: "+maior_Nome);
    }
}
