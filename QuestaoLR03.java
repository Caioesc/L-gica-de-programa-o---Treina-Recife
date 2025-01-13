/*Questão 3: Validação de Entradas
Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd'. */

import java.util.Scanner;
public class QuestaoLR03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade, cont = 0;
        double salario;
        char sexo, estadoCivil;


            do{ 
                System.out.println("Informe seu nome: ");
                nome = sc.nextLine();
                if(nome.length() <= 3){
                    System.out.println("O nome deve ter mais de 3 caracteres! Digite novamente: ");
            }
            }while(nome.length() < 3);
            System.out.println("Nome registrado.");

            do{
                System.out.println("Informe sua idade: ");
                idade = sc.nextInt();
                if(idade < 0 || idade > 150){
                    System.out.println("O nome deve ter mais de 3 caracteres! Digite novamente: ");
                }
            } while(idade < 0 || idade > 150);
            System.out.println("Idade registrada.");

            do{
                System.out.println("Informe seu salário: ");
                salario = sc.nextDouble();
                if(salario <= 0){
                    System.out.println("O salário deve ser maior que 0! Informe um salário válido");
                    }
            } while(salario <= 0);
            System.out.println("Salário registrado.");

            do{
                System.out.println("Informe seu sexo (Masculino ou Feminino): ");
                sexo = sc.next().toUpperCase().charAt(0);
                if(sexo != 'M' && sexo != 'F'){
                    System.out.println("Informe um sexo válido!");
                        }
            }while(sexo != 'M' && sexo != 'F');
            System.out.println("Sexo registrado.");

            do{
                System.out.println("Informe seu estado civil: ");
                estadoCivil = sc.next().toUpperCase().charAt(0);
                if(estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D'){
                    System.out.println("Informe um estado civil válido: ");
                    }
            }while(estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D');
            System.out.println("Estado civil registrado.");

        System.out.println("Cadastro realizado!");
        sc.close();
        
    }
}
