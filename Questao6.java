/*Questão 6: Área do círculo
 Faça um programa que peça o raio de um círculo, calcule e imprima sua área. A área de um círculo é dada por
 Ac = pi*(R*R), onde R é o raio do círculo.*/

import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do raio: ");
        double raio = sc.nextDouble();
        final double PI = 3.14;
        double area = PI * (raio * raio);

        System.out.printf("A área do círculo cujo raio é %.2f é de %.2f", raio, area);
        sc.close();
    }
}
