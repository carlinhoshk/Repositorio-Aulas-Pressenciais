// 20:00 - 11/05/2022
//Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros e no final apresente o
//total do somatório da fatorial de cada valor lido.
package EstruturaDoWhile;

public class Exercicio5 {
    public static void main(String[] args) {

        int i=0, x=0, f=1, contador=0, soma=0;
        do {
            f += f*contador;
            contador++;
            soma += contador;
        }while (contador <=15);
        System.out.println("o Total do somtario da fatorial é: " + soma);

    }
}
