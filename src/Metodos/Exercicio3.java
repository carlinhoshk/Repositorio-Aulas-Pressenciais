package Metodos;
import java.util.Scanner;


public class Exercicio3 {
    static void antSessor(int x){
        System.out.println("O antessesor do seu numero é: " + (x-1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = 0;

        System.out.println("Digite um Numero: ");
        a = sc.nextInt();

        antSessor(a);
    }
}

