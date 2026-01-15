import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFicheroPrintWriter {
    static void main() {
        try {
            PrintWriter escritor = new PrintWriter(new FileWriter("C:\\Users\\Alumno T\\Desktop\\prueba.txt", true),true);
            String texto = "Esto es con el PrintWriter";
            escritor.println(texto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
