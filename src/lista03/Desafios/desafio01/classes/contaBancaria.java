package lista03.Desafios.desafio01.classes;

import java.time.LocalDateTime;
import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        ContaBancaria.menu();
    }

    public static class ContaBancaria {
        private static String nome;
        private static String cpf;
        private static int identificadorConta;
        private static String banco;
        private static String endereco;
        private static float saldo;
        private static LocalDateTime horarioAtual;

        public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereço, float saldo, LocalDateTime horarioAtual) {
            ContaBancaria.nome = nome;
            ContaBancaria.cpf = cpf;
            ContaBancaria.identificadorConta = identificadorConta;
            ContaBancaria.banco = banco;
            ContaBancaria.endereco = endereco;
            ContaBancaria.saldo = saldo;
            ContaBancaria.horarioAtual = horarioAtual;
        }

        public static void menu(){
            System.out.println("===================");
            System.out.println("Seja bem-vindo!");
            System.out.println("Por favor, insira seus dados cadastrais:");

            Scanner sc = new Scanner(System.in);

            System.out.println("Nome do titular: " );
            nome = sc.nextLine();

            System.out.println("Número do CPF do titular: ");
            cpf = sc.nextLine();

            System.out.println("Número do identificador da conta: ");
            identificadorConta = sc.nextInt();

            sc.nextLine();

            System.out.println("Nome do banco: ");
            banco = sc.nextLine();

            System.out.println("Endereço do titular: ");
            endereco = sc.nextLine();

            System.out.println("Saldo disponível na conta: ");
            saldo = sc.nextFloat();

            horarioAtual = LocalDateTime.now();
            System.out.println("Horario Atual: " + horarioAtual);
        }
    }
}
