//20:15 - 06/05/2022
// Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar
//se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução
//se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.

package EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        int i = 0;
        int resto = 2;

        while(i <=20 ){
            i++;
            if ((i % resto == 1)){
                System.out.println(i);
            }
        }
    }
}
