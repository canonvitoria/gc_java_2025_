package lista04.Exercicios.exercicio01;

// Crie uma classe base chamada Veiculo que tenha os atributos marca, modelo e ano. Inclua um método chamado informacoes() que exibe esses detalhes.
// Em seguida, crie duas subclasses: Carro e Moto.
// A classe Carro deve ter um atributo adicional numeroDePortas, e a classe Moto deve ter um atributo tipoDeGuidao. Ambas as subclasses devem sobrescrever o método informacoes() para incluir os atributos adicionais. Deve devolver uma string com essas informações.

public class Main {
    public static void main(String[] args) {
        Veiculo veiculoGenerico = new Veiculo("Toyota", "Corolla", 2023);
        Carro meuCarro = new Carro("Honda", "Civic", 2024, 4);
        Moto minhaMoto = new Moto("Yamaha", "seila", 2022, "Esportivo");

        System.out.println(veiculoGenerico.informacoes());
        System.out.println("---------------------------------");
        System.out.println(meuCarro.informacoes());
        System.out.println("---------------------------------");
        System.out.println(minhaMoto.informacoes());
    }

    public static class Veiculo {
        private String marca;
        private String modelo;
        private int ano;

        public Veiculo(String marca, String modelo, int ano){
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        public String informacoes() {
            return String.format("---- Informações do Veiculo ----\nMarca: %s\nModelo: %s\nAno: %d",
                    this.marca, this.modelo, this.ano);
        }
    }

    public static class Carro extends Veiculo {
        // qtributo adicional específico de Carro
        private int numeroDePortas;

        // construtor que recebe todos os dados, inclusive o novo
        public Carro(String marca, String modelo, int ano, int numeroDePortas) {
            // chama o construtor da classe pai (veiculo) para inicializar os atributos herdados
            super(marca, modelo, ano);
            // inicializa o atributo próprio da classe Carro
            this.numeroDePortas = numeroDePortas;
        }

        // sobrescrevendo o método da classe pai
        @Override
        public String informacoes() {
            // chama o método informacoes() da classe pai
            String infoPai = super.informacoes();
            // adiciona a informação específica de Carro
            return infoPai + "\nNúmero de Portas: " + this.numeroDePortas;
        }
    }

    public static class Moto extends Veiculo {
        // atributo adicional específico de Moto
        private String tipoDeGuidao;

        public Moto(String marca, String modelo, int ano, String tipoDeGuidao) {
            super(marca, modelo, ano);
            this.tipoDeGuidao = tipoDeGuidao;
        }

        @Override
        public String informacoes() {
            String infoPai = super.informacoes();
            return infoPai + "\nTipo de Guidão: " + this.tipoDeGuidao;
        }
    }
}