public class Compra {
    MetodoPago metodo;
    double importe;


    public Compra(MetodoPago metodo, double importe) {
        this.metodo = metodo;
        this.importe = importe;
    }

    public void pagar() {
        if(metodo instanceof PagoEfectivo) System.out.println("Compra realizada con éxito");
        else {
            if(metodo instanceof PagoTarjeta){
                if(this.importe >= ((PagoTarjeta) metodo).saldo) System.out.println("Compra realizada con éxito");
                else System.out.println("No se ha realizado el pago");

            }
        }
    }
}
