/*Questão 12: Saudação
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
descontos são do Imposto de Renda, que depende do salário bruto (conforme
tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário
Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido
corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao
usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
● Salário Bruto até R$ 900 (inclusive): isento;
● Salário Bruto até R$ 1500 (inclusive): desconto de 5%;
● Salário Bruto até R$ 2500 (inclusive): desconto de 10%;
● Salário Bruto acima de 2500 - desconto de 20%
Imprima na tela as informações, dispostas conforme o exemplo a seguir. No
exemplo o valor da hora é R$ 5 e a quantidade de horas trabalhadas é 220.
Salário Bruto: R$ 5 * 220 = R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS (10%) : R$ 110,00
(-) FGTS (11%): R$ 121,00  
Total de descontos: R$ 165,00*/

import java.util.Scanner;
public class QuestaoED12 {
    public static void main(String[] args) {
        double valorHora, impostoRenda = 0, fgts, inss, salarioLiquido, salarioBruto, sindicato, totalDescontos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora trabalhada: ");
        valorHora = sc.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        sc.close();
        
        salarioBruto = valorHora * horasTrabalhadas;
        if(salarioBruto <= 900){
            impostoRenda = 0;;
        }
        else if(salarioBruto <= 1500){
            impostoRenda = salarioBruto * 0.05;;
        }
        else if (salarioBruto <= 2500){
            impostoRenda = salarioBruto * 0.10;
        }
        else{
            impostoRenda = salarioBruto * 0.20;
        }
        sindicato = salarioBruto * 0.03;
        fgts = salarioBruto * 0.11;
        inss = salarioBruto * 0.10;
        totalDescontos = impostoRenda + sindicato + inss;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: R$" + valorHora + " * " + horasTrabalhadas + " = " + String.format("%.2f", salarioBruto));
        System.out.println("(-) IR (" + getPorcentagemIR(salarioBruto) + "%) : +  R$ " + String.format("%.2f", impostoRenda));
        System.out.println("(-) Sindicato (3%) : R$ " + String.format("%.2f", sindicato));
        System.out.println("Valor a ser recolhido do FGTS (11%): R$" + String.format("%.2f", fgts));
        System.out.println("Total de descontos: R$ " + String.format("%.2f", totalDescontos));
        System.out.println("Salário líquido: R$ " + String.format("%.2f", salarioLiquido));
    }
    public static int getPorcentagemIR(double salarioBruto){
        if(salarioBruto <= 900){
            return 0;
        }
        else if(salarioBruto <= 1500){
            return 5;
        }
        else if(salarioBruto <= 2500){
            return 10;
        }
        else{
            return 20;
        }
    }
}
