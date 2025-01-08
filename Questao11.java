/*Questão 11: Cálculo da Área de um Triângulo
Implemente um programa em Java que receba a base e a altura de um triângulo e
imprima sua área. A fórmula da área do triângulo é dada por: 𝐴 = 𝑏𝑎𝑠𝑒 × 𝑎𝑙𝑡𝑢𝑟𝑎 / 2. */

import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da base do triangulo: ");
        double base = sc.nextDouble();
        System.out.println("Informe o valor da altura do triangulo: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        sc.close();
        System.out.printf("A área do triângulo é de: %.2f", area);
    }

}
