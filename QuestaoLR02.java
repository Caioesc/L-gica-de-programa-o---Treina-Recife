/*Questão 2: Validação de Senha
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as
informações. */

import java.util.Scanner;
public class QuestaoLR02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeUsuario, senha;

        do { 
            System.out.println("Digite o nome de usuário: ");
            nomeUsuario = sc.nextLine();
            System.out.println("Digite a senha: ");
            senha = sc.nextLine();

            if (nomeUsuario.equals(senha)) {
                System.out.println("O nome de usuário e a senha não podem ser iguais! Digite novamente.");
            }
        } while (nomeUsuario.equals(senha));
        System.out.print("Nome de usuário e senha resgistrados!");
        sc.close();
    }
}
