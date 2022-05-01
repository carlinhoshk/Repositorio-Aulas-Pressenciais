// 17:29 - 01/05/2022
// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
//de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
//o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
//(considere que o mês possua 4 semanas exatas).

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada,entrada1, horaExtra, acreCimoDeSalario, contaParaSemana, contaParaDia ,contaParaSalario, total, salarioTotal;

        horaExtra = 40;

        System.out.println("Quantas horas você trabalhou nesse mês? ");
        entrada = sc.nextInt();

        System.out.println("Qual é seu salario por hora?: ");
        entrada1 = sc.nextInt();

        contaParaSemana = entrada / 4;

        contaParaDia = contaParaSemana / 24;

        salarioTotal = entrada * entrada1;

        acreCimoDeSalario = (100*salarioTotal)/50;

        if (horaExtra > contaParaSemana){
            System.out.println("O salario com acrecimo vai ser: " +acreCimoDeSalario);
        } else {
            System.out.println("O Salario sem acrecimo vai ser: " + salarioTotal);
        }
    }
}
