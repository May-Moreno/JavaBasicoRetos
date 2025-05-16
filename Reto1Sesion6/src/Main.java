import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens");

        Set<String> especiesUnicas = new HashSet<>(listaMuestras);

        Map<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dra. Lopez");
        idInvestigador.put("M-002", "Dr. Hernandez");
        idInvestigador.put("M-003", "Dra. Martinez");

        System.out.println("Orden de llegada de las muestras: ");
        for (String especie : listaMuestras){
            System.out.println("especie: " +especie);
        }
        System.out.println();

        System.out.println("Especies unicas procesadas: ");
        for (String especie : especiesUnicas){
            System.out.println("Revisada: "+especie);
        }
        System.out.println();

        System.out.println("Relacion ID de muestra e investigador: ");
        for (Map.Entry<String, String> entrada : idInvestigador.entrySet()){
            System.out.println(entrada.getKey()+ " -> " + entrada.getValue());
        }
        System.out.println();

        String idBusqueda = "M-002";
        System.out.println("Busqueda por ID: " +idBusqueda);
        if (idInvestigador.containsKey(idBusqueda)){
            System.out.println("Investigador responsable: " +idInvestigador.get(idBusqueda));
        } else {

            System.out.println("No se encontro una muestra con ese ID");
        }
    }
}