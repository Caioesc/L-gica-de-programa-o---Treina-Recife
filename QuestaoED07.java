/*Questão 7: Menor de Três Números
Faça um programa que leia três números e imprima o menor deles. */

import java.util.Scanner;
public class QuestaoED07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int numero2 = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        int numero3 = sc.nextInt();
        sc.close();

        if(numero1 < numero2 && numero1 < numero3){
            System.out.printf("%d é o menor numero", numero1);
        }
        else if(numero2 < numero1 && numero2 < numero3){
            System.out.printf("%d é o menor numero", numero2);
        }
        else{
        System.out.printf("%d é o menor número", numero3);
        }
        
    }
}