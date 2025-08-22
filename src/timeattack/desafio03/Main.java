package timeattack.desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        String sobrenome = scanner.next();
        int idade = scanner.nextInt();
        scanner.nextLine();
        String frase = scanner.nextLine();
        System.out.println(nomeCompleto(nome, sobrenome));
        System.out.println(idade(idade));
        System.out.println(fraseFav(frase));
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return nome + sobrenome;
    }

    public static int idade(int idade) {
        return idade;
    }

    public static String fraseFav(String frase) {
        return frase;
    }
}