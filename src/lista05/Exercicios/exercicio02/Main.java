package lista05.Exercicios.exercicio02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Crie um programa que receba uma lista de números inteiros e armazene apenas os números únicos em um HashSet.
// Imprima o conjunto resultante. (Não vale apenas passar a lista no construtor>:D )
//Exemplo de entrada:
//Entrada: [1, 2, 2, 3, 4, 4, 5]
//Saída: [1, 2, 3, 4, 5]

public class Main {
    public static void main(String[] args) {
        List<Integer> listaComDuplicacao = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 1, 5, 6);
        System.out.println("Entrada: " + listaComDuplicacao);
        Set<Integer> numerosUnicos = new HashSet<>(listaComDuplicacao);
        System.out.println("Saída: " + numerosUnicos);
    }
}