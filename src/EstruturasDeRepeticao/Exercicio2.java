// 19:53 - 06/05/2022
//Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).
package EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (i <=100){
            System.out.println("Soma: " + i++ );
        }

    }
}
