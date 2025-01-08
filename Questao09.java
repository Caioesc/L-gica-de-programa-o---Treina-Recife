/*Questão 9: Conversão de Unidades (Temperatura)
Faça um programa que peça a temperatura em graus Fahrenheit, transforme e
mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9). */

import java.util.Scanner;
public class Questao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = 5 * ((fahrenheit - 32) / 9);
        sc.close();
        System.out.printf("%.2f Graus fahrenheit em graus celsius é: %.2f", fahrenheit, celsius);
    }
}
