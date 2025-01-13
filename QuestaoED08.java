/*Questão 8: Produto mais Barato
Faça um programa que pergunte o preço de três produtos e informe qual produto
você deve comprar, sabendo que a decisão é sempre pelo mais barato. */

import java.util.Scanner;
public class QuestaoED08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da primeira compra: ");
        double primeiroValor = sc.nextDouble();
        double menorValor = primeiroValor;
        System.out.println("Informe o valor do segundo produto: ");
        double segundoValor = sc.nextDouble();
        if(segundoValor < menorValor){
            menorValor = segundoValor;
        }
        System.out.println("Informe o valor do terceiro produto: ");
        double terceiroValor = sc.nextDouble();
        if(terceiroValor < menorValor){
            menorValor = terceiroValor;
        }
        sc.close();
        System.out.printf("O menor valor é:  R$%.2f", menorValor);
    }
}
