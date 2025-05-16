package hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente p1 = new Paciente();

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del paciente: ");
        p1.nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        p1.edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el número de expediente: ");
        p1.numeroExpediente = scanner.nextLine();

        // Mostrar la información
        System.out.println("\n--- Información del Paciente ---");
        p1.mostrarInformacion();

        scanner.close();
        }
}