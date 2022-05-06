// 15:51 - 05/05/2022
//  Ler dois valores e imprimir uma das três mensagens a seguir:

import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroUm, numeroDois;

        System.out.println("Digite o primeiro valor: ");
        numeroUm = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        numeroDois = sc.nextInt();

        if (numeroUm == numeroDois){
            System.out.println("Numeros iguais");
        }
        if (numeroUm > numeroDois){
            System.out.println("Primeiro é Maior");
        }
        if (numeroDois > numeroUm){
            System.out.println("Segundo maior");
        }
    }
}
