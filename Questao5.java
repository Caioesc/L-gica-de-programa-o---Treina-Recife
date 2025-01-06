/*Questão 2: Conversão de metros para centímetros
Faça um programa que peça um valor em metro e então mostre o valor correspondente em centímetro.*/

import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Digite a quantidade de metros: ");
        double metros = sc.nextDouble();
        double centimetros = metros*100;

        System.out.printf("%.2f metros em centímetros é igual a %.2f centímetros!", metros, centimetros);
        sc.close();
    }
}
