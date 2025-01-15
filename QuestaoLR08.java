/*Questão 8: Soma e Média
Faça um programa que leia 5 números e informe a soma e a média dos números */

import java.util.Scanner;
public class QuestaoLR08 {
    public static void main(String[] args) {
        double [] numero = new double [5];
        double media, soma = 0;
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.printf("Informe o %dº número: ", i+1);
            numero[i] = sc.nextDouble();
            soma += numero[i];
        }
        media = soma/numero.length;
        sc.close();
        System.out.printf("A média dos números é: %.2f.", media);
    }
}
