// 20:20 - 02/05/2022
//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
//maiores. 

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int entradaUm, entradaDois, entradaTres, conta;

        System.out.println("Digite o primeiro Valor: ");
        entradaUm = sc.nextInt();

        System.out.println("Digite o segundo Valor: ");
        entradaDois = sc.nextInt();

        System.out.println("Digite o terceiro Valor: ");
        entradaTres = sc.nextInt();


        if ((entradaUm > entradaTres) && ( entradaDois > entradaTres)) {
            System.out.println("O valor um e dois são os maiores e a soma dos dois é: " + (entradaUm+entradaDois));
        } else if ((entradaDois > entradaUm) && (entradaTres > entradaUm)) {
            System.out.println("O valor dois e tres são os maiores e a soma dos dois é: " + (entradaDois+entradaTres));
        } else{
            System.out.println("O valor um e tres são os maiores e a soma dos dois é: " + (entradaUm+entradaTres));
        }

    }
}
