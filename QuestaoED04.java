/*Questão 4: Positivo ou Negativo
  Faça um algoritmo que receba um número e informe se ele é positivo ou negativo.*/

import java.util.Scanner;
public class QuestaoED04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe do número desejado: ");
        int numero = sc.nextInt();
        sc.close();

        if(numero % 2 == 0){
            System.out.printf("%d é par!", numero);
        }
        else{
            System.out.printf("%d é ímpar!", numero);
        }
    }
}
