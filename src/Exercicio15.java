// 21:32 - 29/04/2022
//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada;

        System.out.println("Digite seu Numero: ");
        entrada = sc.nextInt();

        if (entrada < 0 ){
            System.out.println("Seu numero é negativo");
        } else {
            System.out.println("Seu numero é Positivo");
        }



    }


}
