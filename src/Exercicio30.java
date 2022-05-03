// 21:22 - 02/05/2022
// Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
//crescente.

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entradaUm, entradaDois, entradaTres;

        System.out.println("Digite o primeiro Valor: ");
        entradaUm = sc.nextInt();

        System.out.println("Digite o segundo Valor: ");
        entradaDois = sc.nextInt();

        System.out.println("Digite o terceiro Valor: ");
        entradaTres = sc.nextInt();

        if ((entradaUm > entradaDois) && ( entradaDois > entradaTres)) {
            System.out.println("Primeiro, Segundo, Terceiro: " + entradaUm + entradaDois + entradaTres);
        } else if ((entradaDois > entradaUm) && (entradaTres > entradaUm)) {
            System.out.println("Segundo, Terceiro, Primeiro: " + entradaDois + entradaTres + entradaUm);
        } else{
            System.out.println("Terceiro, Primeiro, Segundo " + entradaTres + entradaUm + entradaDois);
        }

    }
}
