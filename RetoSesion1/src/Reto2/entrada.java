public class entrada {
    String NameEvent;
    double PrecioEntrada;

    public Entrada(String NameEvent, double PrecioEntrada){
        this.NameEvent = NameEvent;
        this.PrecioEntrada = PrecioEntrada;
    }
    public void mostrarInformacion(){
        System.out.println("Evento: " + NameEvent + " | Precio: $" + PrecioEntrada);
    }
}