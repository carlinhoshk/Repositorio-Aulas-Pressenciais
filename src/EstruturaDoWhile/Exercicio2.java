//19:32 - 11/05/2022
// Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
//1 até 500.
package EstruturaDoWhile;

public class Exercicio2 {
    public static void main(String[] args) {

        int a=1, soma=0;

        do {
            if (a % 2 ==0){
                soma += a;
            }
            a++;
        }while(a <= 500);
        System.out.println("A soma é: " + soma);
    }
}
