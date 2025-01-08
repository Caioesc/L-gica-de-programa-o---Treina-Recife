/*Questão 8: Cálculo de Salário
Faça um programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e imprima o total do seu salário no referido mês. */

import java.util.Scanner;
public class Questao08{

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor ganho por hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        int horas = sc.nextInt();
        double salario = valorHora * horas;
        sc.close();
        System.out.printf("O valor do seu salário no mês é de: %.2f", salario);
    }
}