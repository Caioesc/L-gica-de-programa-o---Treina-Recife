/*Questão 15: Cálculo de Média de Notas
Implemente um programa em Java que solicite ao usuário a quantidade de notas
que ele deseja informar. Em seguida, o programa deve receber cada uma das notas.
Por fim, calcule e imprima a média dessas notas com duas casas decimais. */

import java.util.Scanner;
public class QuestaoLR15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas desejdas: ");
        int qtdNotas = sc.nextInt(), soma = 0;
        double [] notas = new double[qtdNotas];

        for(int i = 0; i < qtdNotas; i++){
            System.out.printf("Informe a %dª nota: ", i+1);
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        sc.close();
        double media = soma/qtdNotas;
        System.out.printf("A média das notas é igual a: %.2f", media);
    }
}
