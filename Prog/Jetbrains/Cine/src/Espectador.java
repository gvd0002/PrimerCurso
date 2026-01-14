public class Espectador {
    String nombre;
    int edad;
    double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public boolean esMenor(){
        return edad < 18;
    }

    public int getEdad(){
        return this.edad;
    }

    public double getDinero(){
        return this.dinero;
    }

    public String toString(){
        return "Nombre: " + this.nombre + " Edad: " + this.edad;
    }
}
