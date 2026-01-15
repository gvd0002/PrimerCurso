import java.io.*;
import java.util.Scanner;

public class Main {
    static void main() {
        try {
            PrintWriter escritor = new PrintWriter(new FileWriter("C:\\Users\\Alumno T\\Desktop\\EjercicioClase.txt", true),true);
            String texto = "";
            Scanner scan = new Scanner(System.in);
            do{
                texto = scan.nextLine();
                escritor.println(texto);
            }
            while(!texto.contains("salir"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {

            BufferedReader lector = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Alumno T\\Desktop\\EjercicioClase.txt")));
            String linea = "";
            String texto = "";

            linea = lector.readLine();
            while(linea != null){
                texto += linea + "\n";
                linea = lector.readLine();
            }
            System.out.println(texto);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
