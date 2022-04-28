import java.util.Scanner;

public class Exercicio6_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado, area;

        System.out.println("Digite o valor da Entrada: ");
        lado = sc.nextDouble();

        area = (lado * lado);

        System.out.println("A area do seu Quadrado é : " + area);


    }
}
