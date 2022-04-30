// 21:37 - 29/04/2022
//As maçãs custam R$ 1,30 cada, se forem compradas menos de uma dúzia, e R$ 1,00 se forem
//compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
//escreva o custo total da compra

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int entrada;
       double meiaDuziaMaca, duziaMaca, calculoMeia, calculoDuzia;

        System.out.println("Digite quantas maça você vai comprar: ");
        entrada = sc.nextInt();

       meiaDuziaMaca = 1.30;
       duziaMaca = 1.00;

       calculoMeia = entrada * meiaDuziaMaca;
       calculoDuzia = entrada * duziaMaca;

       if (entrada >= 12){
           System.out.println("O Total da Compra vai ser: " + calculoMeia + "R$" );
       } else {
           System.out.println("O Total da Compra vai ser: " + calculoDuzia+ "R$");
       }




    }
}
