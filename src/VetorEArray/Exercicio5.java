package VetorEArray;
//22:16 - 30/05/2022
//  Ler um vetor C de 10 elementos inteiros, trocar todos os valores negativos do vetor C por 0.
//Escrever o vetor C modificado.
public class Exercicio5 {
    public static void main(String[] args) {
        int c[] = {1,2,4,5,-1,-2,-3,-4,-5};

        for (int i=0;i<=c.length-1;i++){
            if (c[i]<=-1){
                c[i]=0;
            }System.out.println("array:" + c[i]);
        }


    }
}
