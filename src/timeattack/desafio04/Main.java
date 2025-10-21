package timeattack.desafio04;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        matriz[0][0] = 10;
        matriz[1][2] = 25;
        matriz[2][3] = 40;
        matriz[4][3] = 70;
        matriz[5][3] = 490;

        System.out.println("--- Elementos específicos da matriz ---");
        System.out.println("Elemento na posição [0][0]: " + matriz[0][0]);
        System.out.println("Elemento na posição [1][2]: " + matriz[1][2]);
        System.out.println("Elemento na posição [4][3]: " + matriz[2][3]);
        System.out.println("Elemento na posição [4][5]: " + matriz[2][3]);
        System.out.println("Elemento na posição [6][7]: " + matriz[2][3]);
        System.out.println();

    }
}
