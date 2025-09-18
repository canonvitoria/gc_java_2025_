package lista03.Exercicios.exercicio01;

//  Escolha um objeto da sala, crie a classe com as características e comportamentos que você julgue necessários.

public class Main {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("azul", "BIC", 0.7f);
        caneta.escrever();
    }
}

public class Caneta {
    private String cor;
    private String modelo;
    private float ponta;

    public Caneta(String cor, String modelo, float ponta) {
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public void escrever() {
        System.out.println("Escrevendo...");
    }
}

