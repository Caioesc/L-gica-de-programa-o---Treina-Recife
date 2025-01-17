/*1 - Faça um programa que leia 20 números inteiros e apresente:
a. Média dos ímpares
b. Maior número par
c. Diferença do maior menos o menor número */

import java.util.Scanner;
public class Questao1_20250117{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maiorPar = Integer.MIN_VALUE, maiorImpar = Integer.MIN_VALUE, somaImpar = 0, menorNumero = 0, maiorNumero, menorPar = Integer.MAX_VALUE, menorImpar = Integer.MAX_VALUE, contImpar = 0;
        double mediaImpar;

        for(int i = 0; i < 20; i++){
            System.out.printf("Informe o %dº número: ", i+1);
            numero = sc.nextInt();
            if(numero % 2 == 0){
                if(numero > maiorPar){
                    maiorPar = numero;
                }
                if(numero < menorPar)
                    menorPar = numero;
                }
            
            else{
                contImpar++;
                somaImpar += numero;
                if(numero > maiorImpar){
                    maiorImpar = numero;
                }
                if(numero < menorImpar){
                    menorImpar = numero;
                
                }
            }
        }
        sc.close();
        mediaImpar = somaImpar/contImpar;
        if(maiorImpar > maiorPar){
            maiorNumero = maiorImpar;
        }
        else{
            maiorNumero = maiorPar;
        }

        if(menorImpar < menorPar){
            menorNumero = menorImpar;
        }
        else{
            menorNumero = menorPar;
        }

        System.out.printf("\nA média dos número ímpares é: %.2f \n", mediaImpar);
       
        if(contImpar < 20){
            System.out.printf("O maior número par é: %d \n", maiorPar);
        }
        else{
            System.out.println("Não foram informados números pares.");
        }
        
        System.out.printf("A diferença entre o maior valor e o menor é de: %d \n", maiorNumero-menorNumero);       
    }
}