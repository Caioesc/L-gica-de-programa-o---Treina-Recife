/*Questão 7: área do quadrado
Faça um programa que calcule a área de um quadrado, em seguida imprima o dobro desta área para o usuário. A área de
um quadrado é dada por Aq = L*L, onde L é o comprimento do lado do quadrado */

import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado: ");
        double lado = sc.nextInt();
        double area = lado * lado;
        System.out.printf("O dobro da área do quadrado de lado %.2f é de %.2f", lado, area*2);
        sc.close();
    }
}
