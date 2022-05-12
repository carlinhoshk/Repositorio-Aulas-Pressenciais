//21:39 - 11/05/2022
//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o
//total do somatório, a média aritmética e o total de valores lidos. O programa deve fazer as leituras
//dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve
//parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar
//como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da
//média.
package EstruturaDoWhile;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,numero=0, soma=0, media=0;

        do {
            i++;
            System.out.println("digite um numero: ");
            numero = sc.nextInt();

            soma += numero;
            media += numero / i;


        }while (numero > -1);
        System.out.println("a Soma é: " + soma);
        System.out.println("A Média é: "+ media);

    }
}
