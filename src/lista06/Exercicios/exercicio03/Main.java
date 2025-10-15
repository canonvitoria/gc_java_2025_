package lista06.Exercicios.exercicio03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Crie um programa que utilize um HashSet para armazenar uma lista de nomes de estudantes.
// Em seguida, pergunte ao usuário por um nome e verifique se o nome está no conjunto, imprimindo uma mensagem apropriada.
//Exemplo de saída:
    //Entrada: Ana
    //Saída: "O nome Ana está presente no conjunto."

public class Main {
    public static void main(String[] args) {
        Set<String> nomesEstudantes = new HashSet<>();
        nomesEstudantes.add("Ana");
        nomesEstudantes.add("Carlos");
        nomesEstudantes.add("Beatriz");
        nomesEstudantes.add("Daniel");
        nomesEstudantes.add("Fernanda");

        System.out.println("Lista de estudantes cadastrados: " + nomesEstudantes);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite um nome para verificar se ele está na lista: ");
        String nomeParaBuscar = scanner.nextLine();

        if (nomesEstudantes.contains(nomeParaBuscar)) {
            System.out.println("O nome " + nomeParaBuscar + " está presente no conjunto");
        } else {
            System.out.println("O nome " + nomeParaBuscar + " NÃO está presente no conjunto.");
        }
    }
}