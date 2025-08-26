import java.util.Scanner;]

// Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double num3 = scanner.nextDouble();

        double maior = num1; 

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        double menor = num1; 
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        double media = (num1 + num2 + num3) / 3;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética é: " + media);
    }
}