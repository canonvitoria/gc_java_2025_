package lista02.Desafios.Desafio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int [3][3];

//        int linha = 0;
//        int coluna = 0;

        for (int linha = 0; linha < matriz.length; linha++)  {
            System.out.println(linha);
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println(linha);
            }
       }

//        for(int i = 0; i < matriz.length; i++) {
//            System.out.println(matriz[i][i]);
//        }
    }
}
