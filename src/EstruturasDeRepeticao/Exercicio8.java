// 22:15 - 06/05/2022
// Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit
package EstruturasDeRepeticao;

public class Exercicio8 {
    public static void main(String[] args) {

        int Celsius = 10;
        int fahrenheit, fahrenheit1;
        int reseta=0;
        int reseta2=0;

        int i=0;
        while(i <= 100){
            i++;
            fahrenheit = ( 9 * Celsius + 160 ) / 5;
            reseta = fahrenheit;
            reseta2 = reseta;
            System.out.println(fahrenheit);


        }



    }
}
