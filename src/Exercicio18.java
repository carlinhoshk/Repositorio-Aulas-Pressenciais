// 14:22 - 30/04/2022
// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
//poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada;

        System.out.println("Digite seu ano de nascimento: ");
        entrada = sc.nextInt();

        if (entrada <= 2006){
            System.out.println("Prabéns você pode votar!");
        } else {
            System.out.println("Infeslimente você não pode votar!");
        }
    }
}
