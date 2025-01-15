/*Questão 7: Maior Número
Faça um programa que leia 5 números e informe o maior número. */

import java.util.Scanner;
public class QuestaoLR07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero = new int [5];
        int maiorNumero = 0;
        for(int i = 0; i < 5; i++){
            System.out.printf("Informe o %dº número: ", i+1);
             numero[i]= sc.nextInt();
             if(numero[i] > maiorNumero){
                maiorNumero = numero[i];
             }
        }
        sc.close();
        System.out.printf("O maior número digitado foi: %d", maiorNumero);
    }
}
