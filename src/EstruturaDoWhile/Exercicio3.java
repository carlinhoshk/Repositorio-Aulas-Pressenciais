// 11/05/2022
//Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o
//número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a
//instrução se, perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o
//próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1.

package EstruturaDoWhile;

public class Exercicio3 {
    public static void main(String[] args) {

        int a =1;
        do {
            if (a % 4 == 0){

                System.out.println("o numero é divisivel por 4: " + a);
            }
            a++;

        }while (a <=200);
    }
}
