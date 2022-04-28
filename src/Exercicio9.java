// 16:50 - 26/04/2022

// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário.
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int salario, reajuste, total, percentual;

        System.out.println("Digite o Salario Mensal do Funcionario: ");
        salario = sc.nextInt();

        System.out.println("Digite o Percentual do Reajuste do Salario: ");
        reajuste = sc.nextInt();

        total = salario + reajuste;
        percentual = (100 * salario) / total;

        System.out.println("O Novo Salario desse Funcionario será de: " + (salario + percentual));
    }
}
