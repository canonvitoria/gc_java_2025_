package lista01.exercicio02;
import java.util.Scanner;

// Crie uma variável com seu respectivo tipo para todos os itens:
//-Um nome;
//-Uma idade;
//-Se uma pessoa possuí cadastro.
//-Um cpf;
//-Um telefone;
//-Uma altura em metros;

public class Main {
    public static void main(String[] args) {

        String nome;
        int idade;
        char possuiCadastro;
        int cpf;
        int telefone;
        int altura;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome:");
        scanner.nextLine();
        System.out.println("Idade: ");
        scanner.nextInt();
        System.out.println("Possui cadastro? (N/S): ");
        scanner.next();
        System.out.println("CPF: ");
        scanner.next();
        System.out.println("Telefone: ");
        scanner.next();
        System.out.println("Altura (em metros): ");
        scanner.next();
    }

}
