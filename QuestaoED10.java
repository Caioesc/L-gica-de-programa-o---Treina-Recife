/*Questão 10: Saudação
Faça um programa que pergunte em que turno você estuda. Peça para digitar M
(Matutino), V (Vespertino) ou N (Noturno). Imprima a mensagem "Bom Dia!", "Boa
Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. */

import java.util.Scanner;
public class QuestaoED10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o turno que você estuda \n(M - Matutino) \n(V - Vespertino) \n(N - Noturno)");
        char horario = sc.next().toUpperCase().charAt(0);
        sc.close();

        switch (horario) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
            System.out.println("Boa noite!");
                break;
            default:
            System.out.println("Valor inválido!");
                break;
        }
    }
}
