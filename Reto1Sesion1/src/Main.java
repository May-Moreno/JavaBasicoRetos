import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente paciente = new Paciente();

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el número de expediente: ");
        String numeroExpediente = scanner.nextLine();

        // Asignar valores al objeto
        paciente.setNombre(nombre);
        paciente.setEdad(edad);
        paciente.setNumeroExpediente(numeroExpediente);

        // Mostrar la información
        System.out.println("\n--- Información del Paciente ---");
        paciente.mostrarInformacion();

        scanner.close();
    }
}