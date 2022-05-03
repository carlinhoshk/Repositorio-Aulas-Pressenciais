// 19:58 - 02/05/2022
//  Ler um valor e escrever se é positivo, negativo ou zero.

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double entrada;

        System.out.println("Digite um Valor: ");
        entrada = sc.nextDouble();

        if (entrada > 0){
            System.out.println("Seu numero é Positivo");
        } else if (entrada < 0 ){
            System.out.println("Seu numero é Negativo");
        } else {
            System.out.println("Seu numero é Zero");
        }


    }
}
