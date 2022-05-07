// 19:59 - 06/05/2022
//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
//1 até 500.
package EstruturasDeRepeticao;

public class Exercicio3 {
    public static void main(String[] args) {

        int i = 1;
        int resto = 2;

        while(i <= 500){
            i++;
            if ((i % resto == 0)){
                System.out.println(i);
            }

        }

    }
}
