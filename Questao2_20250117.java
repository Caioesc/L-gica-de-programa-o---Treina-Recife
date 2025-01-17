/*2 - Uma pesquisa sobre algumas características físicas da população de uma
determinada região coletou os seguintes dados referentes a cada habitante
para serem analisados:

• Sexo (“M” - Masculino, “F” - Feminino)
• Cor dos Olhos (“A”-Azul,”V”-Verde, “C"-Castanho)
• Idade em anos

Para cada habitante foi digitada uma linha com esses dados e a última linha,
que não corresponde a ninguém conterá o valor de idade igual a -1. Fazer um
programa que determine e imprima:
a) A maior idade dos habitantes;
b) A porcentagem de indivíduos do sexo feminino cuja idade está entre 18 e
35 anos inclusive e que tenham olhos verdes;*/

import java.util.Scanner;
public class Questao2_20250117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo, corOlhos;
        int idade = 0, maiorIdade = 0, numeroPessoas = 0, pessoasNoPadrao = 0;
        
        while (idade != -1){

            do { 
                System.out.println("Informe o sexo: (F - femimnino e M - Masculino)");
                sexo = sc.next().toUpperCase().charAt(0);
                if(sexo != 'F' && sexo != 'M'){
                    System.out.println("Informe um sexo válido!");
                }
            } while (sexo != 'F' && sexo != 'M');
            do { 
                System.out.println("Informe a cor dos olhos: (A-Azul, V-Verde, C-Castanho)");
                corOlhos = sc.next().toUpperCase().charAt(0);
                if(corOlhos != 'A' && corOlhos != 'V' && corOlhos != 'C'){
                    System.out.println("Informe uma cor válida!");
                }
            } while (corOlhos != 'A' && corOlhos != 'V' && corOlhos != 'C');
            do { 
                System.out.println("Informe a idade: ");
                idade = sc.nextInt();
                if(idade < 0 && idade > 130){
                    System.out.println("Informe uma idade válida!");
                }
            } while (idade < 0 && idade > 130);
            numeroPessoas++;

            if(idade > 18 && idade <= 35 && corOlhos == 'V' && sexo == 'F'){
                pessoasNoPadrao++;
            }
        }    
        numeroPessoas--;
        System.out.println(numeroPessoas);

    }
    
}
