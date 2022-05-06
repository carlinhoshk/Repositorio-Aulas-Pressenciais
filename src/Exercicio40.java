// 23:57 - 05/05/2022
//  Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
//unitário

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nomeProduto;
        int quantidadeProduto;
        double precoProduto, total, totalAPagar, desconto;

        System.out.println("Digite o nome do Produto: ");
        nomeProduto = sc.next();

        System.out.println("Digte a Quantidade do Produto: ");
        quantidadeProduto = sc.nextInt();

        System.out.println("Digite o preço unitario do Produto: ");
        precoProduto = sc.nextDouble();

        if (quantidadeProduto <= 5 ){
            total = quantidadeProduto * precoProduto;
            totalAPagar = total - ((total/100)*2);
            System.out.println("Seu Produto é" + nomeProduto + " e você teve um desconto de 2%, totalizando um preço de: " + totalAPagar + "R$");
        }
        if (quantidadeProduto > 5 && quantidadeProduto <=10){
            total = quantidadeProduto * precoProduto;
            totalAPagar = total - ((total/100)*3);
            System.out.println("Seu Produto é" + nomeProduto + " e você teve um desconto de 3%, totalizando um preço de: " + totalAPagar + "R$");
        }
        if (quantidadeProduto > 10){
            total = quantidadeProduto * precoProduto;
            totalAPagar = total - ((total/100)*5);
            System.out.println("Seu Produto" + nomeProduto + " e você teve um desconto de 5%, totalizando um preço de: " + totalAPagar + "R$");
        }

    }
}
