package Metodos;

import java.util.Scanner;

public class Exercicio4 {

    static void circuferencia(double x){
        System.out.println("Circuferencia " + 3.14*x*x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n0;

        System.out.println("Escreva Circuferencia: ");
        n0 = sc.nextInt();

        circuferencia(n0);
    }
}

