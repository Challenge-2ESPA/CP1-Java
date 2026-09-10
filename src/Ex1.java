import java.util.Scanner;

public class Ex1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma distancia em metros: ");
        double resposta = sc.nextDouble();
        double centimetros = resposta * 100;
        double milimetros = resposta * 1000;
        System.out.println("A sua distancia em centimetros é: " + centimetros + " cm");
        System.out.println("E a mesma distancia em milimetros é de: " + milimetros + " mm");
        System.out.println("Fim do programa");
    }
}
