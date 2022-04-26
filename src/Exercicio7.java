// 22:18
// Exercicio 7 Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        int anos = 365*idade;
        int mes = 12;

        System.out.println("Sua idade é: " + idade);
        System.out.println("\nSua idade em Meses é: " + idade * mes);
        System.out.println("\nSua idade em Dias é: " + anos);




    }
}
