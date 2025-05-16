import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del medicamento: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        var totalSinDescuento = precioUnitario * cantidad;
        boolean aplicaDescuento = totalSinDescuento > 500.0;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0.0;
        double totalAPagar = totalSinDescuento - descuento;

        System.out.println("\n--- Resumen ---");
        System.out.println("Medicamento: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalAPagar);
    }
}
