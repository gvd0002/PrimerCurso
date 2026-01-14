public class CuentaBancaria {
    float saldo;
    Persona titular;


    public CuentaBancaria(Persona titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public void depositarDinero(float cantidad){
        assert(cantidad>0);
        this.saldo += cantidad;
    }
    public void retirarDinero(float cantidad){
        assert(cantidad>0 && cantidad<=this.saldo);
        this.saldo -= cantidad;
    }
}
