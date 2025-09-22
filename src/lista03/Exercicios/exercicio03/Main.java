package lista03.Exercicios.exercicio03;

//Crie uma classe Concessionaria com:
// - Capacidade de armazenar até 10 Carros.
// - Um método adicionarCarro(Carro carro) para adicionar um carro à lista.
// - Um método listarCarros() que imprime todos os carros cadastrados.


public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria(1);
        concessionaria.adicionarCarro();
        concessionaria.listarCarros();
    }

    public static class Concessionaria {
        private int qtdCarros;

        public Concessionaria (int qtdCarros) {
            this.qtdCarros = qtdCarros;
        }

        public void listarCarros(){
            System.out.println("Você tem " + qtdCarros + " carros na sua concessionaria");
        }

        public void adicionarCarro (){
            while (qtdCarros < 10) {
                qtdCarros = qtdCarros + 1;
            }

        }
    }
}
