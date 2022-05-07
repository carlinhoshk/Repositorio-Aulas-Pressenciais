// 19:43 - 06/05/2022
// Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

package EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada, i;

        System.out.println("Digite a tabuada que você quer fazer: ");
        entrada = sc.nextInt();
        i = 0;
        while (i <= 10){
            System.out.println(entrada + "X" + i + "=" + i*entrada );
            i++;
        }



    }
}
