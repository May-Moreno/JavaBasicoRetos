public class Main {
    public static void main(String[] args) {

        Pasajero pasajero1 = new Pasajero("Ana Martínez", "A123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("Reserva realizada con éxito.");
        }

        System.out.println(vuelo.obtenerItinerario());

        vuelo.cancelarReserva();

        System.out.println(vuelo.obtenerItinerario());

        vuelo.reservarAsiento("Mario Gonzalez", "B987654");

        System.out.println(vuelo.obtenerItinerario());
    }
}