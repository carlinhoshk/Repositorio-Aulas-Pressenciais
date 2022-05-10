// 20:13 - 09/05/2022
// Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
//seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
//usuário.
package EstruturasDeRepeticao;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 1, maiorNumero=0, menorNumero=0;

        while (numero >0){
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            } else if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
    }

}
