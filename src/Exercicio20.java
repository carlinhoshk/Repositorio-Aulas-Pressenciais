// 21:12 - 30/04/2022
//  Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada1, entrada2;

        System.out.println("Digite o primeiro valor: ");
        entrada1 = sc.nextInt();

        System.out.println("Digite o primeiro valor: ");
        entrada2 = sc.nextInt();

        if (entrada1 > entrada2){
            System.out.println("Numeros: " + entrada1 + "," + entrada2);
        } else {
            System.out.println("Numeros: " + entrada2 + "," + entrada1);
        }
    }
}
