package VetorEArray;
// 20:28 - 30/05/2022
// Preencher um vetor B de 10 elementos com 1 se o índice do elemento for ímpar e com 0 se for
//par. Escrever o vetor B após o seu total preenchimento.
public class Exercicio3 {
    public static void main(String[] args) {

        int b[] = new int[10];

        for (int i=0;i<=9;i++){
            if (i % 2 == 1){
            // impar
                b[i]=1;
            }else{
            // par
                b[i]=0;
            }System.out.println("array: " + b[i]);
        }

    }
}
