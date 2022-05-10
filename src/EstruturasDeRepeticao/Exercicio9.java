// 19:40 - 09/05/2022
//Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
//somatório e a média aritmética dos valores lidos.
package EstruturasDeRepeticao;

public class Exercicio9 {
    public static void main(String[] args) {

        int i = 1, a = 1, b = 1, c = 0, somatorio =0, mediaAri;

        while (i <=10){
            i++;
            c = a+b;

            a = b;
            b = c;
            somatorio = c;
            mediaAri = somatorio / 10;

            System.out.println("somatorio: " + somatorio);
            System.out.println("media: " + mediaAri);

        }

    }
}
