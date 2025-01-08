/*Questão 18: Cálculo de Peso Ideal II
Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo 
que calcule seu peso ideal, utilizando as seguintes fórmulas:
a. Para homens: (72.7*h) - 58
b. Para mulheres: (62.1*h) - 44.7 */

import java.util.Scanner;
public class Questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura em metros: ");
        double altura = sc.nextDouble();
        double pesoHomem = (72.7 * altura) - 58;
        double pesoMulher = (62.1 * altura) - 44.7;
        sc.close();
        System.out.printf("Para homem: %.2f kg\nPara mulheres: %.2f kg ", pesoHomem, pesoMulher);
    }
}
