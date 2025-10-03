package lista03.Desafios.desafio01.model;

import lista03.Desafios.desafio01.service.ContaService;

import java.util.Scanner;

public class contaBancaria {
    public static class ContaBancaria {
        // atributos
        private static String nome;
        private static String cpf;
        private static int identificadorConta;
        private static String banco;
        private static String endereco;
        private static double saldo;
        private static String horarioAtual;

        public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereço, float saldo, String horarioAtual) {
            // construtor
            ContaBancaria.nome = nome;
            ContaBancaria.cpf = cpf;
            ContaBancaria.identificadorConta = identificadorConta;
            ContaBancaria.banco = banco;
            ContaBancaria.endereco = endereco;
            ContaBancaria.saldo = saldo;
            ContaBancaria.horarioAtual = horarioAtual;
        }

        //get e set
        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            ContaBancaria.saldo = saldo;
        }

        public static void menu(){
            // método menu
            System.out.println("===================");
            System.out.println("Dados Bancários");
            System.out.println("===================");

            System.out.println("Nome do titular: " + nome);
            System.out.println("Número do CPF do titular: " + cpf);
            System.out.println("Número do identificador da conta: " + identificadorConta);
            System.out.println("Nome do banco: " + banco);
            System.out.println("Endereço do titular: " + endereco);
            System.out.println("Saldo disponível na conta: " + saldo);
            System.out.println("Horário Atual: " + horarioAtual);

            System.out.println("\n========================");
            System.out.println("1 - Sacar");
            System.out.println("Qual opção você deseja?");

            Scanner sc = new Scanner(System.in);
            char opcao = sc.next().charAt(0);

            switch (opcao) {
                case '1':
                    ContaService minhaConta = new ContaService();
                    System.out.print("Digite o valor que deseja sacar: R$");
                    double valorSaque = sc.nextDouble();
                    ContaBancaria conta;
                    minhaConta.sacar(conta, valorSaque); // Chama o método NO OBJETO e passa o valor
                    break;
                case '2':
                    System.out.println("dha.,dh.a,");
                default:
                    break;
            }
        }

    }
}
