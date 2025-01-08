/*Questão 2: Positivo ou Negativo
Faça um programa que peça um número ao usuário e imprima na tela se o valor é
positivo ou negativo. */

import java.util.Scanner;
public class QuestaoED02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número desejado: ");
        int numero = sc.nextInt();
        sc.close();
        
        if (numero >= 0){
            System.out.println("O número digitado é positivo.");
        }
        else{
            System.out.println("O número digitado é negativo.");
        }
    }
}
