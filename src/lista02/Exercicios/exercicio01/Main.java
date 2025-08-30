package lista02.Exercicios.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° número: ");
        int inicio = scanner.nextInt();

        System.out.println("Digite o 2° número:");
        int fim = scanner.nextInt();

        System.out.println("-------------------------------------");
        System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}