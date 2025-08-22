package lista01.exercicio01;

    public class Main {
        public static void main(String[] args) {
//       constante no Java se identifica por FINAL
            final float PI = 3.14f;

            System.out.println(soma(2, 2));
            System.out.println(subtracao(2, 2));
        }

        public static int soma(int a, int b ) {
            return a + b;
        }

        public  static int subtracao (int a, int b) {
            return a - b;
        }
    }
