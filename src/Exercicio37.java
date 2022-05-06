// 20:36 - 05/05/2022
// fruteira

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double quiloMorango, quiloMaca, total, calculoDesconto, valorMorango, valorMaca, total2;

        System.out.println("Digite a quantiade de Quilos de morangos: ");
        quiloMorango = sc.nextDouble();

        System.out.println("Digite a quantidade de Quilos de maças: ");
        quiloMaca = sc.nextDouble();

        total = quiloMaca + quiloMorango;

        if (quiloMaca > 5){
            valorMaca = quiloMaca * 1.5;
        }
        else{
            valorMaca = quiloMaca * 1.8;
        }
        if (quiloMorango > 5){
            valorMorango = quiloMorango * 2.5;
        }
        else{
            valorMorango = quiloMorango * 2.2;
        }

        total2 = valorMorango + valorMaca;
        if ((total2 > 25) || (total > 8)){
            calculoDesconto = total2 - ((total2/100)*10);
            System.out.println("Sua compra vai ter desconto: " + calculoDesconto);
        }
        else {
            System.out.println("Sua compra não vai ter desconto: " + total2);
        }


    }
}
