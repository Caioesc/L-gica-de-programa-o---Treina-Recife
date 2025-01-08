/*Questão 6: Maior de Três Números
Faça um programa que leia três números e imprima o maior deles. */

import java.util.Scanner;
public class QuestaoED06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int numero2 = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        int numero3 = sc.nextInt();
        sc.close();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.printf("%d é o maior número!", numero1);
        }
        else if (numero2 > numero1 && numero2 > numero3){
            System.out.printf("%d é o maior número!", numero2);
        }
        else if (numero3 > numero1 && numero3 > numero2){
            System.out.printf("%d é o maior número!", numero3);
        }
        else{
            System.out.println("São todos iguais!");
        }
    }
}