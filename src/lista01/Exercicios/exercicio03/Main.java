package lista01.Exercicios.exercicio03;

//Crie uma constante para armazenar um salário base.
//Leia a quantidade de horas extras trabalhadas.
//Considere que cada hora extra vale R$ 50,00.
//Calcule e exiba o salário total do funcionário

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioBase = 3000;
        double horasExtras = 50;

        System.out.println("Horas extras trabalhadas:");
        double horasExtrasFeitas = scanner.nextDouble();

        double totalHorasExtras = horasExtras * horasExtrasFeitas;
        double salarioTotal = salarioBase + totalHorasExtras;

        System.out.println("Salário total: R$" + salarioTotal);
    }
}
