import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            guardarParametros();
            leerParametros();
        } catch (IOException e) {
            System.err.println("Error durante la operación de archivo: " + e.getMessage());
        }
    }

    public static void guardarParametros() throws IOException {
        // Definir el directorio y el archivo
        Path directorio = Paths.get("config");
        Path archivo = directorio.resolve("parametros.txt");

        // Crear el directorio si no existe
        if (Files.notExists(directorio)) {
            Files.createDirectories(directorio);
            System.out.println("Carpeta 'config/' creada.");
        }

        // Parámetros de simulación
        String parametros = """
            Tiempo de ciclo: 55.8 segundos
            Velocidad de línea: 1.2 m/s
            Número de estaciones: 8
            """;

        // Escribir en el archivo
        Files.write(archivo, parametros.getBytes());
        System.out.println("Archivo 'parametros.txt' creado exitosamente.");
    }

    public static void leerParametros() throws IOException {
        Path archivo = Paths.get("config", "parametros.txt");

        // Verificar existencia
        if (Files.exists(archivo)) {
            String contenido = Files.readString(archivo);
            System.out.println("\nContenido de 'parametros.txt':\n" + contenido);
        } else {
            System.out.println("El archivo no existe.");
        }
    }

}