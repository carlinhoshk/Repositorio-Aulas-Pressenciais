// 21:18 - 18/05/2022
// Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar
//se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução
//se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.
package EstruturaFor;

public class ExercicioE {
    public static void main(String[] args) {

        for (int i =1; i<=20;i++){
            if (i % 2 ==1){
                System.out.println("O numero é impar: " + i);
            }
        }


    }
}
