/*Questão 1: Validação de Valor da Nota
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
caso o valor seja inválido e continue pedindo até que o usuário informe um valor
válido. */

import java.util.Scanner;
public class QuestaoLR01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double nota;

        do{
            System.out.println("Informe o valor da nota: ");
            nota = sc.nextDouble();
            if(nota > 10 || nota < 0){
                System.out.println("Valor inválido! Digite uma nota de 0 até 10!");
            }
        } while(nota < 0 || nota > 10);
        System.out.printf("Nota %.2f registrada.", nota);
        sc.close();
    }
}
