/*Questão 1: Maior de Dois Números
Faça um programa que peça dois números ao usuário e imprima o maior deles. */

import java.util.Scanner;
public class QuestaoED01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double numero2 = sc.nextDouble();
        sc.close();

        if (numero1 < numero2){
            System.out.printf("%.2f é o maior número!", numero2);
        }
        else if (numero1 == numero2){
            System.out.println("Os números são iguais!");
        }
        else{
            System.out.printf("%.2f é o maior número!", numero1);
        }
    }
}
