package lista02.Exercicios.exercicio03;

// Escreva um programa que receba uma string e imprima ela ao contrário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palavra = "";
        stringInvertida(palavra);
    }

    public static void stringInvertida(String palavra) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva sua comida favorita: ");
        palavra = sc.nextLine();

        int tamanhoPalavra = palavra.length();
        String palavraInvertida = "";

        for (int i = tamanhoPalavra - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
            System.out.println(palavraInvertida);
        }


    }
}
