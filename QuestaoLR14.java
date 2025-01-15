/*Questão 14: Quantidade de Números Pares
Implemente um programa em Java que receba do usuário dois números inteiros
distintos e retorne a quantidade de números pares que existem entre esses dois
números, excluindo os próprios números. */

import java.util.Scanner;
public class QuestaoLR14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    
    System.out.println("Informe o primeiro número: ");
    num1 = sc.nextInt();
    System.out.println("Informe o segundo número: ");
    num2 = sc.nextInt();
    sc.close();
    
    for(int i = num1 + 1; i < num2; i++){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }
    }

}
