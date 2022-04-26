//  22:13
// Exercicio 6

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c = 0;

        System.out.println("Escreva a Base :");
        a = sc.nextInt();

        System.out.println("Escreva a Altura :");
        b = sc.nextInt();

        c = a * b;
        System.out.println("A area do seu Retangulo é: " + c);

    }
}
