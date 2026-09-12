import java.util.Scanner;
public class Ex12 {
    static void main(String[] args){
        System.out.println("Programa para saber o volume da caixa");
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a altura da caixa: ");
        double altura_Caixa = sc.nextDouble();
        System.out.println("Informe o comprimento da caixa: ");
        double comprimento_Caixa = sc.nextDouble();
        System.out.println("Por ultimo a largura da caixa");
        double largura_Caixa = sc.nextDouble();
        double volume_Caixa = (altura_Caixa*comprimento_Caixa*largura_Caixa);
        System.out.println("O Volume da sua caixa é: "+volume_Caixa);

    }

}
