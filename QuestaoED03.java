/*Questão 3: Masculino ou Feminino
Faça um programa que verifique se uma letra digitada é "F" ou "M". Conforme a
letra digitada pelo usuário, o programa deve imprimir: F - Feminino, M - Masculino,
ou Sexo Inválido. */

import java.util.Scanner;
public class QuestaoED03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite F ou M: ");
        char letra = sc.next().toUpperCase().charAt(0);
        sc.close();

        switch (letra) {
            case 'F':
                System.out.println("F - Feminino");
                break;
            case 'M':
                System.out.println("M - Masculino");
                break;
            default:
                System.out.println("Letra inválida!");
                break;
        }
    }
}
