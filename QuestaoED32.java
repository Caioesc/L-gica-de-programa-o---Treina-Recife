/*Questão 32: Número Palíndromo
Um palíndromo é uma sequência de caracteres que sendo lida da esquerda para a
direita ou da direita para a esquerda tem o mesmo valor. Por exemplo, cada um dos
seguintes inteiros de 5 dígitos é um palíndromo: 12321, 55555, 45554 e 11611. Escreva
um programa que leia uma sequência de números de 5 dígitos e determine se ele é
ou não um palíndromo. */

import java.util.Scanner;
public class QuestaoED32 {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número de 5 dígitos: ");
    String numero = sc.nextLine();

    if(numero.length() != 5 || !numero.matches("\\d+")){ //.matches está verificando se o que foi digitado são numeros
        System.out.println("Você deve digitar um número exatamente com 5 dígitos");
    }
    else{
        if(isPalindromo(numero)){
            System.out.println("O número " + numero + " é um palíndromo!");
        }
        else{
            System.out.println("O número " + numero + " Não é um palíndromo!");
        }
    }
    sc.close();
    }

    //Função para verificar se número é um palíndromo
    public static boolean isPalindromo(String numero){
        int n = numero.length();
        for(int i = 0; i < n / 2; i++){
            if (numero.charAt(i) != numero.charAt(n -1 -i)){
                return false;
            }
        }
        return true;
    }
}
