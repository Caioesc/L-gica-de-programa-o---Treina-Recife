/*Questão 2: Soma de dois números
Faça um programa que peça dois números e então mostre a soma deles */

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        int numero1, numero2, soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;
        System.out.printf("A soma dos números %d e %d é: %d", numero1, numero2, soma);
        sc.close();
    }
}
