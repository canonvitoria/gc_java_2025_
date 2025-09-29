package lista03.Desafios.desafio01.classes;

public class contaBancaria {
    public static class ContaBancaria {
        // atributos
        private static String nome;
        private static String cpf;
        private static int identificadorConta;
        private static String banco;
        private static String endereco;
        private static float saldo;
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
            System.out.println("Digite a opção desejada:");
            System.out.println("========================");

            // (talvez) fazer um switch com as opções, dentro de cada switch chama os métodos
            // reorganizar os arquivos, ter uma pasta MODEL  e um a service
        }

//        public static void saque() {
//            // método saque
//
//            if (saldo == 0 || saldo < saque) {
//                System.out.println(">> Saldo insuficiente.");
//            } else {
//                saldo =- saque;
//            }
//        }

    }
}
