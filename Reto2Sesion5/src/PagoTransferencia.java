public class PagoTransferencia extends MetodoPago implements Autenticable{
    private boolean conexionBancoValida;
    public  PagoTransferencia(double monto, boolean conexionBancoValida){
        super(monto);
        this.conexionBancoValida = conexionBancoValida;
    }

    @Override
    public boolean autenticar(){
        return conexionBancoValida;
    }

    @Override
    public void procesarPago(){
        System.out.println("Procesando transferencia por $" + monto);
    }
}
