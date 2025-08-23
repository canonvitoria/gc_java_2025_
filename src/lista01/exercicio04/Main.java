package lista01.exercicio04;
import java.util.Scanner;

// Crie um programa que receba uma temperatura em Celsius e converta para Fahrenheit.
// Fórmula = Celsius into/para Fahrenheit: (oC x 9) / 5) + 32

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }
}
