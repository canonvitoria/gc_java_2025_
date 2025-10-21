package lista04.Desafios.desafio01;

// Imagine que uma empresa precisa organizar diferentes tipos de dívidas de clientes, permitindo negociar valores de acordo com regras específicas para cada situação.
// Crie uma estrutura de classes que permita representar uma dívida de forma genérica.
// Considere que podem existir diferentes formas de dívida (exemplo: cartão, empréstimo), cada uma com sua própria maneira de negociação.
// Todas as dívidas devem possuir informações comuns e permitir que a negociação seja realizada de forma padronizada, mas com resultados diferentes dependendo do tipo de dívida.
// Por fim, implemente uma classe responsável por aplicar a negociação em qualquer dívida que seja fornecida, sem precisar conhecer os detalhes internos de cada tipo.

public class Main {
    public static void main(String[] args) {
        Divida divida1 = new DividaCartao(1000.00, "Ana Silva", "1234-5678-...");
        Divida divida2 = new DividaEmprestimo(5000.00, "Bruno Costa", 0.02);

        ServicoNegociacao negociador = new ServicoNegociacao();

        negociador.realizarNegociacao(divida1);
        negociador.realizarNegociacao(divida2);
    }

    public static abstract class Divida {
        protected double valorOriginal;
        protected String devedor;

        public Divida(double valorOriginal, String devedor) {
            this.valorOriginal = valorOriginal;
            this.devedor = devedor;
        }

        public double getValorOriginal() {
            return valorOriginal;
        }

        public String getDevedor() {
            return devedor;
        }

        public abstract double negociar();
    }

    public static class DividaCartao extends Divida {
        private String numeroCartao;

        public DividaCartao(double valorOriginal, String devedor, String numeroCartao) {
            super(valorOriginal, devedor);
            this.numeroCartao = numeroCartao;
        }

        @Override
        public double negociar() {
            double valorNegociado = this.valorOriginal * 0.90;
            System.out.println("Negociação para Dívida de Cartão (" + numeroCartao + "): Valor original R$" + valorOriginal + " -> Valor negociado R$" + valorNegociado);
            return valorNegociado;
        }
    }

    public static class DividaEmprestimo extends Divida {
        private double taxaJuros;

        public DividaEmprestimo(double valorOriginal, String devedor, double taxaJuros) {
            super(valorOriginal, devedor);
            this.taxaJuros = taxaJuros;
        }

        @Override
        public double negociar() {
            double valorNegociado = this.valorOriginal * 0.95;
            System.out.println("Negociação para Dívida de Empréstimo (Devedor: " + devedor + "): Valor original R$" + valorOriginal + " -> Valor negociado R$" + valorNegociado);
            return valorNegociado;
        }
    }
    public static class ServicoNegociacao {

        public void realizarNegociacao(Divida divida) {
            System.out.println("Iniciando negociação para " + divida.getDevedor() + "...");
            double valorFinal = divida.negociar();
            System.out.println("Negociação concluída. Valor final: R$" + valorFinal);
            System.out.println("------------------------------------");
        }
    }
}