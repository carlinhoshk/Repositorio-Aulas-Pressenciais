// 20:06 - 13/05/2022
// Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
//seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
//usuário.
package EstruturaDoWhile;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maiorNUmero=0, menorNumero=0, numero=1;

        do {
            System.out.println("DIgite um numero: ");
            numero = sc.nextInt();

            // numero++;

            if (numero > maiorNUmero){
                maiorNUmero = numero;
            } else if (numero < menorNumero) {
                menorNumero = numero;

            }

        }while (numero > -1);
        System.out.println("O Maior numero é: " + maiorNUmero);
        System.out.println("O Menor numero é: " + menorNumero);




    }
}
