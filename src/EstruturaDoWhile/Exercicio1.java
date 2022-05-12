// 19:19 - 11/05/2022
// Apresentar os quadrados dos números inteiros de 15 a 200.
package EstruturaDoWhile;

public class Exercicio1 {
    public static void main(String[] args) {

        int a = 15;

        do {
            a++;
            System.out.println(a*a);
        }while (a <=200);
    }
}
