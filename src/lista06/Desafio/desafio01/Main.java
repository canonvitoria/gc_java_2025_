package lista06.Desafio.desafio01;

import java.util.HashMap;
import java.util.Map;

// Escreva um programa que receba uma frase e conte quantas vezes cada palavra aparece na frase.
// Exemplo de saída:
    //Entrada: "O rato roeu a roupa do rei de Roma"
    //Saída: {O=1, rato=1, roeu=1, a=1, roupa=1, do=1, rei=1, de=1, Roma=1}

public class Main {
    public static void main(String[] args) {
        String frase = "três pratos de trigo para três tigres tristes";
        System.out.println("Entrada: " + frase);

        Map<String, Integer> contagemPalavras = new HashMap<>();
        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            String palavraTratada = palavra.toLowerCase();
            int contagem = contagemPalavras.getOrDefault(palavraTratada, 0);
            contagemPalavras.put(palavraTratada, contagem + 1);
        }
        System.out.println("Saída: " + contagemPalavras);
    }
}