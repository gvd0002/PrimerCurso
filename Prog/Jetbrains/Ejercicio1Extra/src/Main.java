public class Main {
    static void main() {

        MetodoPago efectivo = new PagoEfectivo();
        MetodoPago tarjeta = new PagoTarjeta();

        Compra compra = new Compra(efectivo, 30);
        Compra compra2 = new Compra(tarjeta, 100);
        Compra compra3 = new Compra(tarjeta, 10);
        compra.pagar();
        compra2.pagar();
        compra3.pagar();


    }
}
