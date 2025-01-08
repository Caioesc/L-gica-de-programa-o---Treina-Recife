/*Questão 23: Tempo de Download
Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado
de download do arquivo usando este link (em minutos). */

import java.util.Scanner;
public class Questao23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo em MB: ");
        double megaBytes = sc.nextDouble();
        System.out.println("Informe a velocidade do link de Internet em Mbps: ");
        double megaBits = sc.nextDouble();
        double velocidade = megaBits * 0.125;

        double tempoSegundos = megaBytes / velocidade;
        double tempoMinutos = tempoSegundos / 60;
        sc.close();

        System.out.printf("O tempo aproximado de download é de: %.2f minutos", tempoMinutos);   
    }
}
