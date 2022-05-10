// 19:55 - 09/05/2022
// Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
//pares situados na faixa numérica de 50 a 70.

package EstruturasDeRepeticao;

public class Exercicio10 {
    public static void main(String[] args) {

        int i = 50, soma, mediaAri, resto=2;

        while (i <= 70){
            i++;
            if (i % resto == 0){
                i++;
                soma = i++;
                mediaAri = i++ / 70;
                System.out.println("soma: " + soma);
                System.out.println("media Aritimética: " + mediaAri);
            }

        }

    }
}
