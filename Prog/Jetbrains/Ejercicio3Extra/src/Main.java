public class Main {
    static void main() {
        CuentaAhorro cuenta = new CuentaAhorro();
        if(cuenta.depositar()) System.out.println("Ingreso realizado");
        else System.out.println("No se ha realizado el ingreso");
        if(cuenta.retirar()) System.out.println("Retirada realizada");
        else System.out.println("No se ha realizado la retirada");
    }
}
