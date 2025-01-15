/*Questão 10: Intervalo entre Números I
Faça um programa que receba dois números inteiros e gere os números inteiros que
estão no intervalo compreendido por eles. */

import java.util.Scanner;
public class QuestaoLR10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextInt();
        sc.close();
        
        for(int i = num1 + 1; i < num2; i++){
            System.out.println(i);
        }
    }
    
}
