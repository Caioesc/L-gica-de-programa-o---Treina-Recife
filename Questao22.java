/*Questão 22: Quantidade de Latas de Tintas II
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é
de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18
litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00. Informe
ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3
situações:

● Comprar apenas latas de 18 litros;
● Comprar apenas galões de 3,6 litros;
● Misturar latas e galões, de forma que o desperdício de tinta seja menor.
Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.*/

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da área a ser pintada (em m2): ");
        double area = sc.nextDouble();
        double areaComFolga = area * 1.1;

        double litrosNecessarios = areaComFolga/6;

        int capacidadeLata = 18;
        double precoLata = 80.0;
        double capacidadeGalao = 3.6;
        double precoGalao = 25.0;

        int galoesNecessarios = (int) Math.ceil(litrosNecessarios / capacidadeGalao);
        double custoGaloes = galoesNecessarios * precoGalao;

        int latasNecessarias = (int) Math.ceil(litrosNecessarios / capacidadeLata);
        double custoLatas = latasNecessarias * precoLata;
        
        double restoLitros = litrosNecessarios % capacidadeLata;
        int latasParaMistura = (int) (litrosNecessarios / capacidadeLata);
        int galoesParaMistura = (int) Math.ceil(restoLitros / capacidadeGalao);
        double custoMistura = (latasParaMistura * precoLata) + (galoesParaMistura * precoGalao);
        sc.close();

        System.out.printf("Apenas latas de 18 litros: \n- Quantidade: %d\n- Custo: R$ %.2f", latasNecessarias, custoLatas);
        System.out.printf("\nApenas galões de 3,6 litros: \n- Quantidade: %d \n- Custo: R$ %.2f", galoesNecessarios, custoGaloes);
        System.out.printf("\nMistura de latas e galões:\n- Latas:  %d \n- Galões: %d\n- Custo: R$ %.2f", latasParaMistura, galoesParaMistura, custoMistura);

    }
}