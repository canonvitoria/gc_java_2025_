package timeattack.desafio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(soma(num1, num2));
    }

    public static int num1(int num1) {
        return num1;
    }

    public static int num2(int num2) {
        return num2;
    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }
}