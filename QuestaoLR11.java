/*Questão 11: Intervalo entre Números II
Altere o programa anterior para mostrar no final a soma dos números. */

import java.util.Scanner;

public class QuestaoLR11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma = 0;

        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextInt();
        sc.close();
        
        for(int i = num1 + 1; i < num2; i++){
            System.out.println(i);
            soma += i;
        }
        System.out.printf("Soma dos valores entre os números informados: %d", soma);
    }
}
