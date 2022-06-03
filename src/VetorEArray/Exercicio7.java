package VetorEArray;
// 03:34 - 31/05/2022
//Ler um vetor X de 10 elementos inteiros e positivos. Criar um vetor Y da seguinte forma: os
//elementos de Y com índice par receberão os respectivos elementos de X divididos por 2; os
//elementos com índice ímpar receberão os respectivos elementos de X multiplicados por 3.
//Escrever o vetor X e o vetor Y.
public class Exercicio7 {
    public static void main(String[] args) {

        int[] x = {1,2,3,4,5,6,7,8,9,10};
        int[] y = new int[11];
        for (int i=0;i<=x.length-1;i++){
            if (i % 2 == 1){
            // impar
                y[i] = x[i] / 2 ;
            }
            else{
            // par
                y[i] = x[i] * 3;
            }
            System.out.println("Valores array y: " + y[i] + " || " + "Valores array x: " + x[i]);
            //System.out.println("Valores array x: " + x[i]);

        }


    }
}
