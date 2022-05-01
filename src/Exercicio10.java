// 17:20 - 26/04/2022
// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
//seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
//calcular e escrever o custo final ao consumidor.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int percentualDistri, imposto, entrada, total;

        System.out.println("Digite o Custo do Carro de Fabrica: ");
        entrada = sc.nextInt();

        percentualDistri = (100 * entrada) /  28;
        imposto = (100 * entrada) / 45;
        total = entrada + percentualDistri + imposto;
        System.out.println("O Custo final desse carro vai ser: " + total + "R$");

    }
}
