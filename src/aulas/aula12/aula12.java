package aulas.aula12;

public class aula12 {
    public static void main(String[] args) {
        // excecao
        // checked: roda até o erro
        // unchecked: nao roda nada

        try {
            processar();
        } catch (NumberException ex) {
            System.out.println("Deu erro mas nao quebrou");
        } finally {
            System.out.println("Executo igual");
        }

        System.out.println("Fluxo normal");
    }

    // number exception
    public static void processar() throws NumberException {
        throw new NumberException("Deu Erro.");
    }
}
