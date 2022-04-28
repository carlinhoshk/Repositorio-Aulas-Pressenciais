import java.util.Scanner;


public class Exercicio6_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n0, calculo;
        System.out.println("Escreva Circuferencia: ");
        n0 = sc.nextInt();

        calculo = 3.14*n0*n0;
        System.out.println(calculo);

    }
}
