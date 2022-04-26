 // 22:08
 //25/04/2022
 // Exercicio 5  Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor e sucessor

 import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int a = 0;

        System.out.println("Digite um Numero: ");
        a = sc.nextInt();

        System.out.println("O antessesor do seu numero é: " + (a-1));
        System.out.println("O antessesor do seu numero é: " + (a+1));




    }
}