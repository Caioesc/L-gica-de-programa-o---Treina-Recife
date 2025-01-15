/*Questão 5: Crescimento Populacional II
Altere o programa anterior permitindo ao usuário informar as populações e as taxas
de crescimento iniciais. Valide a entrada e permita repetir a operação. */

import java.util.Scanner;
public class QuestaoLR05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double paisA, paisB, taxaPaisA, taxaPaisB;
        int anos = 0;
        
        System.out.println("Infome a população inicial do país A: ");
        paisA = sc.nextDouble();
        System.out.println("Informe a taxa de crescimento do país A: ");
        taxaPaisA = sc.nextDouble();
        System.out.println("Infome a população inicial do país B: ");
        paisB = sc.nextDouble();
        System.out.println("Informe a taxa de crescimento do país B: ");
        taxaPaisB = sc.nextDouble();
        sc.close();

        while(paisA < paisB){
            paisA = paisA * (1 + taxaPaisA/100);
            paisB = paisB * (1 + taxaPaisB/100);
            anos++;
        }
        System.out.printf("País A: %.2f \nPaís B: %.2f \nA quantidade de anos necessario foi de: %d", paisA, paisB, anos);
    }
}
