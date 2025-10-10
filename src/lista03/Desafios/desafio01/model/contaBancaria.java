package lista03.Desafios.desafio01.model;

import lista03.Desafios.desafio01.service.ContaService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

        // construtor
        public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereco, float saldo, String horarioAtual) {
            ContaBancaria.nome = nome;
            ContaBancaria.cpf = cpf;
            ContaBancaria.identificadorConta = identificadorConta;
            ContaBancaria.banco = banco;
            ContaBancaria.endereco = endereco;
            ContaBancaria.saldo = saldo;
            ContaBancaria.horarioAtual = horarioAtual;
        }

        // get e set
        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            ContaBancaria.saldo = saldo;
        }

        // alterar endereço
        public void alterarEndereco(String novoEndereco) {
            endereco = novoEndereco;
        }

        // menu
        public static void menu(ContaBancaria contaParaOperacao){
            Scanner sc = new Scanner(System.in);
            char opcao;

            DateTimeFormatter formatadorDeHora = DateTimeFormatter.ofPattern("HH:mm:ss");

            //do-while faz que o menu seja exibido pelo menos uma vez
            do {
                LocalDateTime agora = LocalDateTime.now();
                String horarioAtualizado = agora.format(formatadorDeHora);

                System.out.println("\n===================");
                System.out.println("Dados Bancários");
                System.out.println("===================");

                System.out.println("Nome do titular: " + nome);
                System.out.println("Número do CPF do titular: " + cpf);
                System.out.println("Número do identificador da conta: " + identificadorConta);
                System.out.println("Nome do banco: " + banco);
                System.out.println("Endereço do titular: " + endereco);
                System.out.println("Saldo disponível na conta: R$" + String.format("%.2f", saldo));
                System.out.println("Horário Atual: " + horarioAtualizado);

                System.out.println("\n======= MENU DE OPÇÕES =======");
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.println("3 - Realizar pix");
                System.out.println("4 - Transferência");
                System.out.println("5 - Alterar endereço");
                System.out.println("6 - Sair");
                System.out.print("Qual opção você deseja? ");

                opcao = sc.next().charAt(0);

                ContaService servico = new ContaService();

                switch (opcao) {
                    case '1':
                        System.out.print("Digite o valor que deseja sacar: R$");
                        double valorSaque = sc.nextDouble();
                        servico.sacar(contaParaOperacao, valorSaque);
                        break;
                    case '2':
                        System.out.print("Digite o valor que deseja depositar: R$");
                        double valorDeposito = sc.nextDouble();
                        servico.depositar(contaParaOperacao, valorDeposito);
                        break;
                    case '3':
                        System.out.println("Digite o valor que deseja realizar no pix: R$");
                        double valorPix = sc.nextDouble();
                        servico.pix(contaParaOperacao, valorPix);
                        break;
                    case '4':
                        System.out.println("Digite o valor que deseja realizar a tranferência: R$");
                        double valorTrans = sc.nextDouble();
                        servico.transferencia(contaParaOperacao, valorTrans);
                    case '5':
                        System.out.print("Digite o novo endereço: ");
                        sc.nextLine();
                        String novoEndereco = sc.nextLine();
                        contaParaOperacao.alterarEndereco(novoEndereco);
                    case '6':
                        System.out.println("Saindo do sistema... Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } while (opcao != '4'); // o loop continua enquanto a opção for diferente de '4'

            sc.close();
        }


    }
}