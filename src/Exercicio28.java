// 20:07 - 20:07
// Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entradaUm, entradaDois, entradaTres;

        System.out.println("Digite seu primeiro Valor: ");
        entradaUm = sc.nextInt();

        System.out.println("Digite seu Segundo Valor: ");
        entradaDois = sc.nextInt();

        System.out.println("DIgite seu Terceiro Valor: ");
        entradaTres = sc.nextInt();

        if (entradaUm > entradaDois && entradaUm > entradaTres) {
            System.out.println("O valor um é o maior: " + entradaUm);
        } else if (entradaDois > entradaUm && entradaDois > entradaTres) {
            System.out.println("O valor dois é o maior: " + entradaDois);
        } else{
            System.out.println("O valor tres é o maior: " + entradaTres);
        }
    }
}

