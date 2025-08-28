package lista01.Exercicios.exercicio06;

// Crie um programa que receba uma nota e atenda aos requisitos:
//- Abaixo de 6 – Aparecer na tela "Reprovado!".
//- De 6 até 10 – Aparecer na tela "Aprovado!".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a Primeira nota aqui: ");
        double notaUm = scanner.nextDouble();

        System.out.println("Digite a Segunda nota aqui: ");
        double notaDois = scanner.nextDouble();

        System.out.println("Digite a Terceira nota aqui: ");
        double notaTres = scanner.nextDouble();

        calculaNota(notaUm, notaDois, notaTres);
    }

    public static double calculaNota(double notaUm, double notaDois, double notaTres) {
        double notaFinal = (notaUm + notaDois + notaTres) / 3;

        int media = 6;

        if (notaFinal < media) {
            System.out.println("Reprovado!");
        }
        else {
            System.out.println("Aprovado!");
        }
        System.out.println("Sua nota foi: " + notaFinal);
        return notaFinal;
    }

}
