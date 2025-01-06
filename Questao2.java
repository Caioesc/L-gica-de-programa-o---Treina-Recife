/*Questão 2: Número Informado
Faça um programa que peça um número e então mostre a mensagem: "O número informado foi [número]" */

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        System.out.println("O número digitado foi: " + numero);
        sc.close();
    }
}
