import java.io.*;

public class LeerFichero {

    static void main() {
        String texto= "";

        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Alumno T\\Desktop\\prueba.txt")));
            String linea = "";

            linea = lector.readLine();
            while(linea != null){
                texto += linea + "\n";
                linea = lector.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(texto);

    }
}
