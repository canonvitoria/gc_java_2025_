package lista04.Exercicios.exercicio02;

// Crie uma interface chamada Pagamento que declare o método processarPagamento().
// Em seguida, crie duas classes:
    // PagamentoCartao e PagamentoBoleto, que implementam a interface e o método de maneira diferente. Nele deve conter as informações dos atributos específicos de cada classe.
// A classe PagamentoCartao deve ter o atributo nomeDoTitular e a classe PagamentoBoleto deve ter o atributo codigoBoleto.
// No método principal, demonstre o uso de polimorfismo chamando o método em diferentes tipos de pagamento.

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new PagamentoCartao("sdfsdf");
        Pagamento pagamentoBoleto = new PagamentoBoleto("dskagdasjkdg312312");
        pagamentoCartao.processarPagamento();
        pagamentoBoleto.processarPagamento();

    }

    public interface Pagamento {
        void processarPagamento();
    }

    // método
    public void processarPagamento(){
        System.out.println("processando");
    }

    // classes (implements -> Pagamento)
    // "maneiras diferentes" -> uma vai receber nome e outra o código
    public static class PagamentoCartao implements Pagamento{
        private String nomeTitular;

        public PagamentoCartao(String nomeTitular) {
            this.nomeTitular = nomeTitular;
        }

        // polimorfismo
        @Override
        public void processarPagamento() {
            System.out.println("processando pagamento cartao");
        }
    }

    public static class PagamentoBoleto implements Pagamento{
        private String codigoBoleto;

        public PagamentoBoleto(String codigoBoleto) {
            this.codigoBoleto = codigoBoleto;
        }


        @Override
        public void processarPagamento() {
            System.out.println("processando pagamento boleto");
        }
    }

}
