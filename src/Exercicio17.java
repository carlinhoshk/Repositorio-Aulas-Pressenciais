// 21:57 - 29/04/2022
// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
//aluno é aprovado). Escrever também a média calculada.
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota1, nota2, calculo;

        System.out.println("Digite a Primeira Nota do Aluno: ");
        nota1 = sc.nextInt();

        System.out.println("Digite a Segunda Nota do Aluno: ");
        nota2 = sc.nextInt();

        calculo = (nota1 + nota2) / 2;

        if (calculo >=6){
            System.out.println("Parabéns você passou com uma Média de: " + calculo);
        } else {
            System.out.println("Infelismente você não passou, sua média é: " + calculo);
        }

    }
}
