package VetorEArray;
//20:10 - 30/05/2022
// Preencher (ler) um vetor X de 10 elementos com o valor inteiro 30. Escrever o vetor X após seu total preenchimento.
public class Exercicio1 {
    public static void main(String[] args) {

        int[] x = {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
        for (int i=0;i<=x.length-1;i++){            //coloquei -1 porque tava dando erro do ultimo array
            System.out.println("Vetor: " + x[i]);
        }
    }
}
