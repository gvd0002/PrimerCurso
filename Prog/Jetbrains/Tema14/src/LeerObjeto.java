import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjeto {
    static void main() {
        try {
            FileInputStream fichero = new FileInputStream("persona.bin");
            ObjectInputStream lector = new ObjectInputStream(fichero);
            Persona personaLeida = (Persona)lector.readObject();

            System.out.println(personaLeida.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
