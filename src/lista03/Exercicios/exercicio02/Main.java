package lista03.Exercicios.exercicio02;

// Crie a classe Carro com no mínimo 4 atributos, será necessário ter um
// método exibirDados(), que ao ser chamado, imprime na tela as informações do carro.

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Preto", "Hibrido", 4, "numsei");
        carro.exibirDados();
    }

    public static class Carro {
        private String cor;
        private String modelo;
        private int qtdPortas;
        private String motor;

        public Carro (String cor, String modelo, int qtdPortas, String motor) {
            this.cor = cor;
            this.modelo = modelo;
            this.qtdPortas = qtdPortas;
            this.motor = motor;
        }

        public void exibirDados() {
            System.out.println("--- Informações do Veículo ---");
            System.out.println("cor: " + cor);
            System.out.println("Modelor: " + modelo);
            System.out.println("Quantidade de Portas: " + qtdPortas);
            System.out.println("Motor: " + motor);
        }
    }
}
