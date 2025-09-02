package lista02.Exercicios.exercicio02;

// Escreva um programa que separa a string em duas metades e imprime a primeira parte

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva aqui uma frase: ");
        String frase = sc.nextLine();

        int tamanho = frase.length();
        int metadeFrase = tamanho / 2;

        String primeiraParte = frase.substring(0, metadeFrase);

        System.out.println("A primeira metade da string é: " + primeiraParte);
    }
}
