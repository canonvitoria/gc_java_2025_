package lista03.Desafios.desafio01.service;

import lista03.Desafios.desafio01.model.contaBancaria;

public class ContaService {
    // o método agora recebe conta que sofrerá o saque
    public void sacar(contaBancaria.ContaBancaria conta, double valorSaque) {
        if (valorSaque <= 0) {
            System.out.println("Erro: Valor de saque inválido.");
            return;
        }
        // set para ler o saldo
        if (conta.getSaldo() >= valorSaque){
            double novoSaldo = conta.getSaldo() - valorSaque;
            // set para atualizar o saldo
            conta.setSaldo(novoSaldo);
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
            System.out.println("Novo saldo: R$" + conta.getSaldo());
        } else {
            System.out.println("Operação falhou: Saldo insuficiente.");
        }
    }

    public void depositar(contaBancaria.ContaBancaria conta, double valorDeposito) {
        double novoSaldo = conta.getSaldo() + valorDeposito;
        conta.setSaldo(novoSaldo);
        System.out.println("Deposito de R$" + valorDeposito + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + conta.getSaldo());

    }
}
