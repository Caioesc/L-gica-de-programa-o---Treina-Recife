/*Questão 10: Cálculo do Volume de uma Esfera
Implemente um programa em Java que receba o raio de uma esfera e retorne seu
volume. A fórmula do volume de uma esfera é dado por: 𝑉 = 4 / 3 × 𝜋 × 𝑟³ */

import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio da esfera: ");
        double raio = sc.nextDouble();
        double volume = 4 / 3 * PI * (raio * raio * raio);
        sc.close();
        System.out.printf("O volume da esfera de raio %.2f é de %.2f", raio, volume);
    }
}
