// 21:56 - 11/05/2022
// Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares
//situados na faixa numérica de 1 a 10.
package EstruturaDoWhile;

public class Exercicio7 {
    public static void main(String[] args) {

        int i=0, numero=1, fatorial=1, soma=0;
        do {
            i++;
            if (numero % 2 == 1){
                fatorial += fatorial*numero;
                numero++;
                System.out.println("Os valores impares fatorial é: " + numero);
            }

        }while (i <= 10);

    }
}
