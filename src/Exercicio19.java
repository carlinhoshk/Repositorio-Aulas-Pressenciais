// 14:48 - 30/04/2022
//Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada1, entrada2;

        System.out.println("Digite o primeiro Valor: ");
        entrada1 = sc.nextInt();

        System.out.println("Digite o segundo Valor: ");
        entrada2 = sc.nextInt();

        if (entrada1 > entrada2){
            System.out.println("O Primeiro valor  é o Maior Numero : " + entrada1);
        } else{
            System.out.println("O Segundo valor é o Maior Numero  : " + entrada2);
        }
    }
}
