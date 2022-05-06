// 01:53 - 06/05/2022
//Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
//exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
//e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double notaUm, notaDois, notaTres, media, mediaDeAproveitamento;
        String Conceito;

        System.out.println("Digite a primeira nota do aluno: ");
        notaUm = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        notaDois = sc.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        notaTres = sc.nextDouble();

        media = notaUm + notaDois + notaTres / 3;
        mediaDeAproveitamento = (notaUm + notaDois * 2 + notaTres * 3 + media) / 7;

        if (mediaDeAproveitamento >=9){
            Conceito = "A";
            System.out.println("O conceito do Aluno vai ser: " + Conceito);
        }
        if (mediaDeAproveitamento >= 7.5 && mediaDeAproveitamento < 9.0){
            Conceito = "B";
            System.out.println("O conceito do Aluno vai ser: " + Conceito);
        }
        if (mediaDeAproveitamento >= 6.0 && mediaDeAproveitamento <7.5){
            Conceito = "C";
            System.out.println("O conceito do Aluno vai ser: " + Conceito);
        }
        if (mediaDeAproveitamento < 6.0){
            Conceito = "D";
            System.out.println("O conceito do Aluno vai ser: " + Conceito);
        }
    }
}
