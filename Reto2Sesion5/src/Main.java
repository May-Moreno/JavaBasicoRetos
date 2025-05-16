public class Main {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(800.0, false)
        };
        for (MetodoPago pago : pagos){
            if (pago instanceof Autenticable metodoAutenticable){
                if (metodoAutenticable.autenticar()){
                    System.out.println("Autentificacion exitosa");
                    pago.procesarPago();
                    pago.mostrarResumen();
                }else {
                    System.out.println("Fallo de autentificacion " +pago.getClass().getSimpleName()+ " no valido");
                }
                System.out.println();
            }
        }
    }
}