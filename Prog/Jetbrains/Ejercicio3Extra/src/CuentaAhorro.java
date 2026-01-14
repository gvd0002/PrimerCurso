import java.util.Scanner;

public class CuentaAhorro implements CuentaBancaria{
    double saldo;
    Scanner scan;


    public CuentaAhorro() {
        scan = new Scanner(System.in);
        double saldoInicial;
        do{
            System.out.println("Introduzca saldo inicial:");
            saldoInicial = scan.nextDouble();
            if(saldoInicial < saldoMinimo) System.out.println("Saldo inicial insuficiente.");
        }
        while (saldoInicial < saldoMinimo);
        this.saldo = saldoInicial;
    }

    @Override
    public boolean depositar() {
        System.out.println("Introduzca cantidad a ingresar:");
        double deposito = scan.nextDouble();;
        boolean completado = false;

        if(deposito > 0){
            this.saldo += deposito;
            completado = true;
            System.out.println("Sueldo actual: " + getSaldo() + "€");
        }
        return completado;
    }

    @Override
    public boolean retirar() {
        System.out.println("Introduzca cantidad a retirar: ");
        double retiro = scan.nextDouble();
        boolean completado = false;

        if(this.saldo-retiro >= saldoMinimo && retiro > 0){
            completado = true;
            this.saldo -= retiro;
            System.out.println("Sueldo actual: " + getSaldo() + "€");
        }
        return completado;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
