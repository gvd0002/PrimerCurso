import java.lang.Math;

public class Espectador {

    String nombre;
    int edad;
    double saldo;
    String cara;

    public Espectador(String nombre, int edad, double saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
        this.cara = generarCara();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    public static String generarCara(){
        String[] emojis = {"5","8","😁","😎","🤩","😑","34","😛","🤑","22","🧐","🤓","😬","297","🙁","😌"};

        int aleatorio = (int)(Math.random() * emojis.length);

        return emojis[aleatorio];
    }

}
