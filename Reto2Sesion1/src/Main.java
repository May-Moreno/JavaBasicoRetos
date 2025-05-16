public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto de Rock", 750.5);
        Entrada entrada3 = new Entrada("Canvencion de anime", 90);

        // Mostrar información
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();
    }
}