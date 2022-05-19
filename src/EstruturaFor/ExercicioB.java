// 20:12 - 18/05/2022
// Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.
package EstruturaFor;
import java.util.Scanner;
public class ExercicioB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        for (int i =1; i<=10; i++){
            System.out.println("A tabuada de " + numero + " X " + i + ": " + numero * i );

        }
    }
}
