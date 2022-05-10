// 20:13 - 09/05/2022
// Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
//seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
//usuário.
package EstruturasDeRepeticao;

public class Exercicio12 {
    public static void main(String[] args) {

        int i=1, maiorNumero, menorNumero;

        while (i > 0){
            i++;
            maiorNumero = i++;
            menorNumero = (i++)-1;
            if (i <= -1){
                i++;
                System.out.println(maiorNumero);
                System.out.println(menorNumero);
            }

        }

    }
}
