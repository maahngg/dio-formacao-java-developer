package edu.dio.trilha_java_basico;

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        /*
        TODO:
         *Conhecer e importar a classe Scanner;
         *Exibir as mensagens para o usuário;
         *Obter pela Scanner os valores digitados no terminal;
         *Exibir a mensagem da conta criada.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = Integer.parseInt(scan.nextLine());;
        System.out.print("Por favor, digite o número da agência (xxx-x): ");
        String numeroAgencia = scan.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scan.nextLine();
        System.out.print("Por favor, digite o seu saldo atual: ");
        double saldoAtual = scan.nextDouble();
        System.out.println();

        System.out.printf("Olá %s! Obrigado por criar uma conta em nosso banco! Sua agência é %s, ", nomeCliente, numeroAgencia);
        System.out.printf("conta %d e seu saldo %f já está disponível para saque.", numeroConta, saldoAtual);
    }
}