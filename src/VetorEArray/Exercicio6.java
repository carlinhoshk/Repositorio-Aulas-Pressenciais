package VetorEArray;
// 22:29 - 30/05/2022
//Ler um vetor D de 10 elementos. Criar um vetor E, com todos os elementos de D na ordem
//inversa, ou seja, o último elemento passará a ser o primeiro, o penúltimo será o segundo e assim
//por diante. Escrever todo o vetor D e todo o vetor E.
public class Exercicio6 {
    public static void main(String[] args) {

        int tamanhoArray = 10;

        int d[] = {1,2,3,4,5,6,7,8,9,10};
        int[] e = new int[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++){
            e[i] = d[tamanhoArray -1 - i];

            System.out.println("contrario: "+ e[i]);
        }

    }
}
