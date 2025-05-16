public class Main {
    public static void main(String[] args) {
        Factura factura1 = new Factura(2500.0, "Servicio de Condultoria", "ABCC010101XYZ");

        Factura factura2 = new Factura(1800.0, "Reparacion de equipo", null);

        System.out.println(factura1.getResumen());
        System.out.println(factura2.getResumen());
    }
}