// 21:50 - 06/05/2022

package EstruturasDeRepeticao;

public class Exercicio7 {
    public static void main(String[] args) {

        int i = 1;
        int a = 1;
        int b = 1;
        int c = 0;
        int total =0;
        while (i <=15){
            i++;
            c = a+b;
            total = c;
            a = b;
            b = c;

            System.out.println(total);
        }

    }
}

