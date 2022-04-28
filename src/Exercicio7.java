// 22:18
// Exercicio 7 Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {


        int idade, dias, mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        mes = 12*idade;
        dias = 365*idade;

        System.out.println("Sua idade é: " + idade);
        System.out.println("\nSua idade em Meses é: " + mes);
        System.out.println("\nSua idade em Dias é: " + dias);




    }
}
