package lista02.Desafios.Desafio01; // Estudo!

public class Main {
    public static void main(String[] args) {

        // 1. Declaração e Inicialização de uma matriz 3x4
        // A sintaxe tipo[][] indica uma matriz, e new int[3][4] cria 3 linhas e 4 colunas.
        int[][] matriz = new int[3][4];

        // 2. Acessando e preenchendo elementos
        // Para acessar um elemento, use o índice da linha e depois o da coluna.
        // Lembre-se que os índices começam em 0.
        matriz[0][0] = 10; // Linha 1, Coluna 1
        matriz[1][2] = 25; // Linha 2, Coluna 3
        matriz[2][3] = 40; // Linha 3, Coluna 4

        System.out.println("--- Elementos específicos da matriz ---");
        System.out.println("Elemento na posição [0][0]: " + matriz[0][0]);
        System.out.println("Elemento na posição [1][2]: " + matriz[1][2]);
        System.out.println("Elemento na posição [2][3]: " + matriz[2][3]);
        System.out.println();

        // 3. Preenchendo a matriz usando laços aninhados (o método mais comum)
        int[][] matrizDinamica = new int[3][3];
        int contador = 1;

        // O laço externo percorre as linhas
        for (int i = 0; i < matrizDinamica.length; i++) {
            // O laço interno percorre as colunas
            for (int j = 0; j < matrizDinamica[i].length; j++) {
                matrizDinamica[i][j] = contador;
                contador++;
            }
        }

        System.out.println("--- Matriz preenchida dinamicamente (3x3) ---");
        // Chama a função para imprimir a matriz de forma organizada
        imprimirMatriz(matrizDinamica);
        System.out.println();

        // 4. Inicialização direta (para valores conhecidos)
        // Você pode criar e preencher a matriz na mesma linha.
        int[][] matrizDireta = {
                {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45}
        };

        System.out.println("--- Matriz com inicialização direta ---");
        imprimirMatriz(matrizDireta);
    }

    // Método auxiliar para imprimir qualquer matriz de inteiros de forma organizada
    public static void imprimirMatriz(int[][] mat) {
        // Percorre cada linha da matriz
        for (int i = 0; i < mat.length; i++) {
            // Percorre cada elemento dentro da linha atual
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t"); // \t adiciona um espaçamento de tabulação
            }
            System.out.println(); // Quebra de linha para começar a próxima linha da matriz
        }
    }
}