package org.example;

import java.util.Scanner;

public class ContaTerminal {

    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inicio();

    }

    public static void inicio(){

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 1000;


        System.out.println("Digite o número da agencia: ");
        numero = scanner.nextInt();

        System.out.println("Digite o nome da sua agencia: ");
        agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.println();

        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");


    }
}
