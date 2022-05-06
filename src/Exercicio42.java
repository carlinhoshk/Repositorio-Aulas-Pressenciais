// 14:41 - 06/05/2022
//Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
//estar em condições, um dos seguintes requisitos deve ser satisfeito:

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, tempTrabalho;

        System.out.println("Quanto anos você tem? ");
        idade = sc.nextInt();

        System.out.println("Quanto tempo de trabalho você tem? ");
        tempTrabalho = sc.nextInt();

        if (idade >= 65 ){
            System.out.println("Parabéns Funcionario você tem 65 anos ou mais e poderá aposentar.");
        }
        if (tempTrabalho >= 30){
            System.out.println("Parabéns você tem 30 anos ou mais de empresa e poderá aposentar");
        }
        if (idade >= 60 && tempTrabalho >= 25 ){
            System.out.println("Parabéns você tem 60 anos ou mais e trabalhou por 25 anos na empresa e poderá aposentar");
        }

    }
}
