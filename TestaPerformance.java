import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        // Teste com ArrayList
        testarPerformance("ArrayList", new ArrayList<>());

        // Teste com HashSet
        testarPerformance("HashSet", new HashSet<>());
    }

    public static void testarPerformance(String nomeDaColecao, Collection<Integer> teste) {
        int total = 200000;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Tempo gasto com " + nomeDaColecao + ": " + tempo + "ms");
    }
}