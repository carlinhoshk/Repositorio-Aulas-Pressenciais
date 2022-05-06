// 14:48 - 06/05/2022
// faça o seguinte algoritmo

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite o primeiro input A: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo input B: ");
        b = sc.nextInt();

        System.out.println("Digite o terceiro input C: ");
        c = sc.nextInt();

        if ((a < b+c) && (b <a+c) && (c <a+b)){
            if ((a == b) && (b == c)){
                System.out.println("Triângulo Equilátero");
            }
            else {
                if ( (a == b) || (b == c) || (a == c)){
                    System.out.println("Triângulo Isósceles");
                }else {
                    System.out.println("Triângulo Escaleno");
                }
            }
        }
        else {
            System.out.println("Não e possível formar um triângulo");
        }
    }
}
