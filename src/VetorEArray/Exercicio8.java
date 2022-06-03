package VetorEArray;
import java.util.Scanner;
// 18:47 - 31/05/2022
// Ler um vetor W de 10 elementos, depois ler um valor V. Contar e escrever quantas vezes o valor V
//ocorre no vetor W e escrever também em que posições (índices) do vetor W o valor V aparece.
//Caso o valor V não ocorra nenhuma vez no vetor W, escrever uma mensagem informando isto.
public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] w = new int[11];
        int[] v = new int[11];
        int[] d = new int[11];

        System.out.println("Digite 10 valores para o Array W: ");
        w[w.length-1] = sc.nextInt();

        System.out.println("Digite 10 valores para o Array V: ");
        v[v.length-1] = sc.nextInt();

        int cont=0;
        for (int i=0;i<w.length;i++){
            int quantidade=0;
            for(int j=0;j<v.length;j++){
                if (w[i] == v[j]){
                    quantidade++;
                }
            }
            if (quantidade > cont){


            }

        }





    }
}
