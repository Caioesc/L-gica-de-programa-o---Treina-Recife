/*Questão 13: Exponenciação “Raiz”
Faça um programa que peça dois números: base e expoente. Em seguida, calcule e
imprima o primeiro número elevado ao segundo número. Não utilize a função de
potência da linguagem. */

import java.util.Scanner;
public class QuestaoLR13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, expoente; 

        System.out.println("Informe o valor da base: ");
        base = sc.nextInt();
        System.out.println("Informe o valor do expoente: ");
        expoente = sc.nextInt();
        sc.close();
        int baseAntiga = base;
        for(int i = 0; i < expoente-1; i++){
            base = base * baseAntiga;
        }
        System.out.printf("O resultado é: %d", base);
    }
}
