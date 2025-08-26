import java.util.Scanner;

// Uma empresa de tecnologia oferece bônus anuais aos seus colaboradores com base em seu nível de desempenho, avaliado ao final do ano. Os níveis são classificados da seguinte forma:
// -Nível Ouro: 10%;
// -Nível Platina: 25%;
// -Nível Diamante: 30%;
// Faça um programa que leia o salário atual de um funcionário e seu nível, calcule e imprima seu novo salário.

public class CalculoBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário atual do funcionário:");
        double salario = scanner.nextDouble();

        System.out.println("Digite o nível de desempenho (Ouro, Platina ou Diamante):");
        String nivel = scanner.next();

        double bonus = 0.0;
        double novoSalario;

        switch (niveltoLowerCase()) {
            case "Ouro":
                bonus = salario * 0.10;
                break;
            case "Platina":
                bonus = salario * 0.25;
                break;
            case "Diamante":
                bonus = salario * 0.30; 
                break;
            default:
                System.out.println("Nível de desempenho inválido. Nenhum bônus será aplicado.");
                break;
        }

        novoSalario =+ bonus;

        System.out.println("Salário Atual: R$ " + String.format("%.2f", salario));
        System.out.println("Bônus Recebido: R$ " + String.format("%.2f", bonus));
        System.out.println("Novo Salário: R$ " + String.format("%.2f", novoSalario));


    }
}