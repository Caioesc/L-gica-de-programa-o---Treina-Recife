/*Questão 12: Tabuada
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
inteiro entre 1 a 10. O usuário deve informar de qual número e qual operação
matemática (soma, subtração, multiplicação ou divisão) ele deseja ver a tabuada. */

import java.util.Scanner;
public class QuestaoLR12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        char operacao;
        
        System.out.println("Informe qual número você quer a tabuada(de 1 a 10): ");
        numero = sc.nextDouble();
        System.out.println("Informe a operação desejada: \nSoma: + \nSubtração: - \nMultiplicação: * \nDivisão: /");
        operacao = sc.next().charAt(0);
        sc.close();

        if(operacao == '+'){
            for(int i = 1; i <= 10; i++){
                System.out.printf("%.2f %s %d = %.2f \n", numero, operacao, i, numero+i);
            }
        }
        else if(operacao == '-'){
            for(int i = 1; i <= 10; i++){
                System.out.printf("%.2f %s %d = %.2f \n", numero, operacao, i, numero-i);
            }
        }
        else if(operacao == '*'){
            for(int i = 1; i <= 10; i++){
                System.out.printf("%.2f %s %d = %.2f \n", numero,operacao, i, numero*i);
            }
        }
        else if(operacao == '/'){
            for(int i = 1; i <= 10; i++){
                System.out.printf("%.2f %s %d = %.2f \n", numero,operacao, i, numero/i);
            }
        }
        else{
            System.out.println("Operação selecionada é inválida!");
        }

    }
}
