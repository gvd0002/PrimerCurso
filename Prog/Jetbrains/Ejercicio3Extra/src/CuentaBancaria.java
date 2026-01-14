public interface CuentaBancaria {
    double saldoMinimo = 50;

    public boolean depositar();
    public boolean retirar();
    public double getSaldo();
}
