// 29/04/2022 21:26
// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
//contrário escrever NÃO É MAIOR QUE 10!

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada;

        System.out.println("Digite um Numero: ");
        entrada = sc.nextInt();

        if (entrada > 10){
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }

    }
}
