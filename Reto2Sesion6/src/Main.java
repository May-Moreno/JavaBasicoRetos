import java.util.concurrent.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matematicas basicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");

        System.out.println("Temas ordenados alfabéticamente:");
        List<Tema> ordenAlfabetico = new ArrayList<>(temas);
        Collections.sort(ordenAlfabetico);
        ordenAlfabetico.forEach(System.out::println);

        System.out.println();

        System.out.println("Temas ordenados por prioridad:");
        List<Tema> ordenPrioridad = new ArrayList<>(temas);
        ordenPrioridad.sort(Comparator.comparingInt(Tema::getPrioridad));
        ordenPrioridad.forEach(System.out::println);

        System.out.println();

        // Mostrar recursos compartidos
        System.out.println("Repositorio de materiales:");
        for (Map.Entry<String, String> entrada : recursos.entrySet()) {
            System.out.println( entrada.getKey() + " -> " + entrada.getValue());
        }
    }

}