import java.util.Scanner;

// Crie um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá votar esse ano

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        int anoAtual = 2025;

        int idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos. Você JÁ PODE votar este ano!");
        } else if (idade >= 16) {
            System.out.println("Você tem " + idade + " anos. O seu voto é OPCIONAL este ano.");
        } else {
            System.out.println("Você tem " + idade + " anos. Você NÃO PODE votar este ano.");
        }
    }
}