package lista03.Desafios.desafio01.service;

import lista03.Desafios.desafio01.model.contaBancaria;
import java.time.LocalTime;

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

    public void pix (contaBancaria.ContaBancaria conta, double valorPix) {
        double novoSaldo = conta.getSaldo() + valorPix;
        conta.setSaldo(novoSaldo);
        System.out.println("Pix de R$" + valorPix + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + conta.getSaldo());
    }

    public void transferencia(contaBancaria.ContaBancaria conta, double valorTrans) {
        LocalTime horaAtual = LocalTime.now();
        LocalTime inicioPermitido = LocalTime.of(8, 0);
        LocalTime fimPermitido = LocalTime.of(19, 0);

        // verifica a hora
        if (!horaAtual.isBefore(inicioPermitido) && horaAtual.isBefore(fimPermitido)) {
            if (conta.getSaldo() >= valorTrans) {
                double novoSaldo = conta.getSaldo() - valorTrans;
                conta.setSaldo(novoSaldo);
                System.out.println("Transferência de R$" + String.format("%.2f", valorTrans) + " realizada com sucesso.");
                System.out.println("Novo saldo: R$" + String.format("%.2f", conta.getSaldo()));
            } else {
                System.out.println("Operação falhou: Saldo insuficiente.");
            }
        } else {
            System.out.println("Operação falhou: Fora do horário permitido para transferências (08:00 às 19:00).");
        }
    }
}
