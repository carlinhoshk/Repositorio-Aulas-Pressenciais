// 19:15 - 04/05/2022
// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String timePrimeiro, timeSegundo;
        int numeroGolsPrimeiroTime, numeroGolsSegundoTime;

        System.out.println("Digite o nome do Primeiro Time: ");
        timePrimeiro = sc.next();

        System.out.println("Digite o nome do Segundo Time: ");
        timeSegundo = sc.next();

        System.out.println("Digite a quantidade de Gols do Primeiro Time: ");
        numeroGolsPrimeiroTime = sc.nextInt();

        System.out.println("Digite a quantidade de Gols do Segundo Time: ");
        numeroGolsSegundoTime = sc.nextInt();

        if (numeroGolsPrimeiroTime > numeroGolsSegundoTime){
            System.out.println("O Vencedor é: " + timePrimeiro);
        } else if (numeroGolsSegundoTime > numeroGolsPrimeiroTime) {
            System.out.println("O Vencedor é: " + timeSegundo);
        }else{
            System.out.println("Deu Empate");
        }

    }
}
