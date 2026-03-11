public class Asiento {

    int[] posicion;
    String valor;
    boolean ocupado;

    public Asiento() {
        this.posicion = posicion;
        this.valor = "";
        this.ocupado = true;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
