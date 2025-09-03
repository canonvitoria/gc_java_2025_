package lista02.Desafios.Desafio02;

// Em dupla - Implemente uma calculadora, onde o usuário deve entrar com 2 números e escolher a operação que deseja realizar (soma, subtração, divisão, multiplicação,
// exponenciação e raiz quadrada). Durante a execução, o programa deve perguntar ao usuário se ele deseja continuar, se não quiser, deve digitar ‘n’ para o programa encerrar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculadora();
    }

    public static void calculadora() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual operação você deseja? " +
                "1 - Soma " +
                "2 - Subtração " +
                "3 - Divisão " +
                "4 - Multiplicação " +
                "5 - Exponenciação " +
                "6 - Raiz Quadrada " +
                "n - Sair");
        char operacao = sc.next().charAt(0);

        if (operacao == 'n') {
            System.out.println("Saindo...");
            return;
        }

        System.out.println("Digite o primeiro número: ");
        int primeiroNum = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNum = sc.nextInt();

        switch (operacao) {
            case '1':
                int soma = primeiroNum + segundoNum;
                System.out.println("A soma entre 2 números é: " + soma);
                break;
            case '2':
                int subtracao = primeiroNum - segundoNum;
                System.out.println("A subtração entre 2 números é: " + subtracao);
                break;
            case '3':
                int divisao = primeiroNum / segundoNum;
                System.out.println("A divisão entre 2 números é: " + divisao);
                break;
            case '4':
                int multiplicacao = primeiroNum * segundoNum;
                System.out.println("A multiplicação entre 2 números é: " + multiplicacao);
                break;
            case '5':
                double exponenciacao = 1;
                for (int i = primeiroNum; i <= segundoNum + 1; i++) {
                    exponenciacao = exponenciacao * primeiroNum;
                    System.out.println(exponenciacao + " x ");
                }
                // 2 5
                // 2 2 2 2 2
                break;
            case '6':
                double inicio = 0;
                double fim = primeiroNum;
                double precisao = 0.00001; // Pra ter um resultado com 5 casas decimais

                while ((fim - inicio) > precisao) {
                    double meio = (inicio + fim) / 2;
                    double quadrado = meio * meio;

                    if (quadrado == precisao) {
                        System.out.println("A raiz é: " + meio);
                        return;
                    } else if (quadrado < primeiroNum) {
                        inicio = meio;
                    } else {
                        fim = meio;
                    }
                }
                System.out.println("A raiz aproximada é: " + inicio);
                break;
            default:
                System.out.println(">> Insira um valor válido!!");
        }
    }
}
