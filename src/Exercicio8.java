// 22:33 exercicio 8 Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores.

// 10:38 - 26/04/2022
//16:49 - 26/04/2022 fim

import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numVotos, numBrancos, numNulos, numValidos ;

        System.out.println("\nEscreva a Quantidade de Votos Nulos: ");
        numNulos = sc.nextInt();

        System.out.println("Escreva a Quantidade de Votos Brancos: ");
        numBrancos = sc.nextInt();

        System.out.println("Escreva a Quantidade de Votos Validos: ");
        numValidos = sc.nextInt();

        int total = numNulos + numValidos + numBrancos;

        System.out.println("A Porcetagem de Votos Nulos é: " + (100*numNulos)/total + "%");
        System.out.println("A Porcetagem de Votos Validos é: " + (100*numValidos)/total + "%");
        System.out.println("A Porcetagem de Votos Brancos é: " + (100*numBrancos)/total + "%");



        //percentual =

    }
}
