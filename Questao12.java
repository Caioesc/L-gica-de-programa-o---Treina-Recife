/*Questão 12: Cálculo do Volume de um Cilindro
Implemente um programa em Java que receba o raio da base e a altura de um
cilindro e retorne seu volume. A fórmula do volume do cilindro é: 𝑉 = 𝜋 × 𝑟² × ℎ. */

import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio da base: ");
        double raioBase = sc.nextDouble();
        System.out.println("Informe o valor da altura: ");
        double altura = sc.nextDouble();
        double volume = 3.14 * (raioBase * raioBase) * altura;
        sc.close();
        System.out.printf("O volume do cilindro é de: %.2f", volume);
    }
    
}
