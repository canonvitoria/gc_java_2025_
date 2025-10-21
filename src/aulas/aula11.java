package aulas;

import java.util.*;

public class aula11 {
    public static void main(String[] args) {
        Collection<String>  lista2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        List<String> lista = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");

        lista.add("D");
        lista.add(2, "E");

        map.put(5, "Nicolas");
        System.out.println(map.get(5));

        System.out.println(lista);  

        // Enuns
        // .ordinal - ordena

        enum StatusPedido{
            PREPARANDO(1),
            EM_TRANSITO(2),
            ENTREGUE(3);

            public int valor;

            StatusPedido(int valor) {
                this.valor = valor;
            }
        }

        System.out.println(StatusPedido.ENTREGUE);
    }
}
