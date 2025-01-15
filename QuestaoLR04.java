/*Questão 4: Crescimento Populacional I
Supondo que a população de um país A seja da ordem de 80000 habitantes com
uma taxa anual de crescimento de 3% e que a população de B seja 200000
habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e
escreva o número de anos necessários para que a população do país A ultrapasse
ou iguale a população do país B, mantidas as taxas de crescimento. */

public class QuestaoLR04{
    public static void main(String[] args) {
        double paisA = 80000, paisB = 200000;
        int anos = 0;
        while(paisA < paisB){
            paisA = paisA * 1.03;
            paisB = paisB * 1.015;
            anos++;
        }
        System.out.printf("País A: %.2f \nPaís B: %.2f \nA quantidade de anos necessario foi de: %d", paisA, paisB, anos);
    }
}