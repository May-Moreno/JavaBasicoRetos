import java.util.Optional;

public class Factura {
    double monto;
    String descripcion;
    Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = (rfc != null) ? Optional.of(rfc): Optional.empty();
    }
    public String getResumen(){
        String resumen = "\n Factura generada:\n" + "Descripcion: " +descripcion+ "\n" + "Monto: $" +monto+ "\n" + "RFC: " +rfc.orElse("[No proporcionado]");
        return resumen;
    }
}
