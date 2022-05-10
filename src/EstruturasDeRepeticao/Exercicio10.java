// 19:55 - 09/05/2022
// Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
//pares situados na faixa numérica de 50 a 70.

package EstruturasDeRepeticao;

public class Exercicio10 {
    public static void main(String[] args) {

        int i = 50, soma =0, mediaAri =0, resto=2;

        while (i <= 70){

            if (i % resto == 0){
                soma += i;
                mediaAri += soma / i;
            }
            i++;
        }
        System.out.println("soma: " + soma);
        System.out.println("media Aritimética: " + mediaAri);
    }
}
