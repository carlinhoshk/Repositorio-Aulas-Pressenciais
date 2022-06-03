package VetorEArray;

import java.util.Scanner;
// 22:12 - 31/05/2022
//Ler um vetor C de 10 nomes de pessoas, após pedir que o usuário digite um nome qualquer de
//pessoa. Escrever a mensagem ACHEI, se o nome estiver armazenado no vetor C ou NÃO ACHEI
//caso contrário.

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = {"maria", "joao", "carlos", "felipe", "mike", "carl", "mery", "carol", "jose", "pedro"};
        String nome;

        System.out.println("Digite o nome que está procurando: ");
        nome = sc.next();


        for (int i=0;i<c.length;i++){
            if (c[i].equals(nome)){               // usei a função equals porque foi a unica que deu certo com String
                System.out.println("ACHEI");
                break;                            // usei break para corta o laço de repetição quando achar a String
            } else{
                System.out.println("NÃO ACHEI");
            }
        }

    }

}
