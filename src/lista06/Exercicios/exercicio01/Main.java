package lista06.Exercicios.exercicio01;

// Crie um enum chamado NivelAcesso com os valores: ADMIN, MODERADOR,USUARIO.
// Crie um método que recebe um NivelAcesso como parâmetro e imprime qual tipo de ação que o usuário pode realizar.
//Exemplo de saída:
    //Entrada: NivelAcesso.ADMIN
    //Saída: "O administrador pode acessar todos os recursos.

enum NivelAcesso {
    ADMIN,
    MODERADOR,
    USUARIO
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Testando com ADMIN:");
        descreverAcesso(NivelAcesso.ADMIN);

        System.out.println("\nTestando com MODERADOR:");
        descreverAcesso(NivelAcesso.MODERADOR);

        System.out.println("\nTestando com USUARIO:");
        descreverAcesso(NivelAcesso.USUARIO);
    }

    public static void descreverAcesso(NivelAcesso nivel) {
        switch (nivel) {
            case ADMIN:
                System.out.println("O administrador pode cadastrar, editar e excluir todos os dados.");
                break;
            case MODERADOR:
                System.out.println("O moderador pode editar e visualizar os dados, mas não pode excluir.");
                break;
            case USUARIO:
                System.out.println("O usuário pode apenas visualizar os dados.");
                break;
            default:
                System.out.println("Nível de acesso desconhecido.");
                break;
        }
    }
}