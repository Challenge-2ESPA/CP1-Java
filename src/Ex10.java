import javax.xml.transform.Source;
import java.util.Scanner;

public class Ex10 {
    static void main(String[] args) {
        System.out.println("------------Calculadora de IMC------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a forma de pagamento desejada: ");
        System.out.println("1 - À vista (desconto de 10%)\n" +
                "2 - Parcelado em 2x (sem juros)\n" +
                "3 - Parcelado em 4x (juros de 8%)\n");


        System.out.println("Digite o valor:");
        Float valor = sc.nextFloat();
        System.out.println("Digite o meio de pagamento:");
        int resposta = sc.nextInt();

        switch (resposta) {
            case 1 -> System.out.println("Valor final: " + (valor - (valor * 0.1)));
            case 2 -> System.out.println("Parcelas de " + valor / 2 + " sem juros");
            case 3 -> System.out.println("4 Parcelas de " + (valor+(valor*0.08))/4 );
        }}
}
