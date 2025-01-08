/*Questão 5: Cálculo de Média de Duas Notas
Faça um programa para a leitura de duas notas parciais de um aluno. O programa
deve calcular a média alcançada por aluno e apresentar:
● A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
● A mensagem "Reprovado", se a média for menor do que sete;
● A mensagem "Aprovado com Mérito", se a média for igual a dez*/

import java.util.Scanner;
public class QuestaoED05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2)/2;
        sc.close();

        if(media >= 7 && media == 10){
            System.out.printf("Aprovado com mérito! \nMédia: %.2f", media );
        }
        else if(media >= 7){
            System.out.printf("Aprovado! \nMédia: %.2f", media);
        }
        else{
            System.out.printf("Reprovado! \nMédia: %.2f", media);
        }
    }
    
}
