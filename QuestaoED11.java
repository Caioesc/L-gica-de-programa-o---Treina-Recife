/*Questão 11: Reajuste de Salário
As Organizações Tabajara resolveram dar um aumento de salário aos seus
colaboradores e lhe contrataram para desenvolver o programa que irá calcular os reajustes. Faça um programa que recebe o salário atual de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
● Salários até R$ 280,00 (inclusive): aumento de 20%;
● Salários entre R$ 280,00 e R$ 700,00 (inclusive): aumento de 15%;
● Salários entre R$ 700,00 e R$ 1500,00 (inclusive) : aumento de 10%;
● Salários maiores que R$ 1500,00: aumento de 5%.
Após o aumento ser realizado, informe na tela:
a. O salário antes do reajuste;
b. O percentual de aumento aplicado;
c. O valor do aumento;
d. O novo salário, após o aumento. */


import java.util.Scanner;
public class QuestaoED11 {
    public static void main(String[] args) {
        double salario, salarioAjustado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário a ser reajustado: ");
        salario = sc.nextDouble();
        sc.close();

        if (salario <= 280){
            salarioAjustado = salario * 1.2;
            System.out.printf("Salário antes do reajuste: R$%.2f \nPercentual de aumento: 20 \nValor do aumento: R$%.2f \nSalário pós aumento: R$%.2f", salario, salarioAjustado-salario, salarioAjustado);
        }
        else if (salario > 280 && salario <= 700 ){
            salarioAjustado = salario * 1.15;
            System.out.printf("Salário antes do reajuste: R$%.2f \nPercentual de aumento: 15 \nValor do aumento: R$%.2f \nSalário pós aumento: R$%.2f", salario, salarioAjustado-salario, salarioAjustado);
        }
        else if (salario > 700 && salario <= 1500 ){
            salarioAjustado = salario * 1.1;
            System.out.printf("Salário antes do reajuste: R$%.2f \nPercentual de aumento: 10 \nValor do aumento: R$%.2f \nSalário pós aumento: R$%.2f", salario, salarioAjustado-salario, salarioAjustado);
        }
        else{
            salarioAjustado = salario * 1.05;
            System.out.printf("Salário antes do reajuste: R$%.2f \nPercentual de aumento: 5 \nValor do aumento: R$%.2f \nSalário pós aumento: R$%.2f", salario, salarioAjustado-salario, salarioAjustado);
        }
    }
}
