package lista03.Desafios.desafio01.main;

// Crie uma classe ContaBancaria com os atributos:
    //• nome (nome do titular da conta)
    //• cpf (número de CPF do titular)
    //• identificadorConta (número de identificação da conta)
    //• banco (nome do banco)
    //• endereco (endereço do titular)
    //• saldo (saldo disponível na conta)
    //• horarioAtual (um atributo para armazenar o horário atual)

// Implemente os seguintes métodos na classe:
    //• saque(): Realiza um saque da conta, desde que o saldo seja suficiente. Caso contrário, exibe uma mensagem de erro.
    //• deposito(): Realiza um depósito na conta, atualizando o saldo.
    //• pix(): Realiza uma transferência PIX. Caso contrário, exibe uma mensagem de erro.
    //• transferencia(): Realiza uma transferência para outra conta bancária, verificando se o horário atual está dentro do intervalo permitido (8hrs às 19hrs) e se o saldo é suficiente. Caso contrário, exibe uma mensagem de erro.
    //• verificarSaldo(): Exibe o saldo atual da conta.
    //• verificarHorario(): Exibe o horário atual.
    //• verificarInformacoes(): Exibe todas as informações da conta bancária, como nome, CPF, saldo, etc.

// Implemente um método alterarEndereco(String novoEndereco) para atualizar o endereço do titular da conta.
// Adicione uma taxa de manutenção mensal à conta bancária, que seja deduzida automaticamente do saldo no primeiro dia de cada mês.
// Crie um método calcularJuros(double taxa) que calcule juros sobre o saldo da conta e os adicione mensalmente.
// Implemente um método fecharConta() que encerre a conta, zerando o saldo e não permitindo mais operações.


import lista03.Desafios.desafio01.model.contaBancaria;

public class Main {
    public static void main(String[] args) {
        contaBancaria.ContaBancaria contaBancaria = new contaBancaria.ContaBancaria("Vitória", "1234567899", 123, "Bradesco", "Rua Tal", 1200, "13:00");
        lista03.Desafios.desafio01.model.contaBancaria.ContaBancaria.menu();
    }
}
