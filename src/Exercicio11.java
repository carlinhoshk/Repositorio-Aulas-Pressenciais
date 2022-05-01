// 19:54 - 27/04/2022

//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
//vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
//vendedor.
import java.util.Scanner;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int salario, comissao, carrosVendidos, total;

        int percentualDistri, imposto, entrada;

        System.out.println("Digite a Quantidade Carro Vendidos pelo Funcionario: ");
        entrada = sc.nextInt();

        percentualDistri = (100 * entrada) /  28;
        imposto = (100 * entrada) / 45;
        total = entrada + percentualDistri + imposto;
        System.out.println("O Custo final desse carro vai ser: " + total + "R$");



    }
}