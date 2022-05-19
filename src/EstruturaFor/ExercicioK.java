//21:47 - 18/05/2022
// Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares
//situados na faixa numérica de 1 a 10.
package EstruturaFor;

public class ExercicioK {
    public static void main(String[] args) {
        int soma=0,fatorial=1;
        for (int i=1; i<=10;i++){
            fatorial *= i;
            fatorial++;
            System.out.println(fatorial);
        }

    }
}
