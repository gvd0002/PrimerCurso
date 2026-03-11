import java.io.*;

public class Persona implements Serializable {
    String nombre;
    String apellidos;
    int edad;
    private static final long serialVersionUID = 1L;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String toString(){
        return this.nombre + " " + this.apellidos + " tiene " + this.edad + " años";
    }

    static void main() {
        Persona yo = new Persona("Gonzalo", "Viedma", 21);
        try {
            FileOutputStream archivo = new FileOutputStream("persona.bin");
            ObjectOutputStream lapiz = new ObjectOutputStream(archivo);
            lapiz.writeObject(yo);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
