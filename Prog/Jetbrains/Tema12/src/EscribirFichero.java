import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class EscribirFichero {
    public static void main(String[] args) {
        String escritura = "Lleva la tarara un vestido blanco lleno de cascabeles";
        Scanner scan = new Scanner(System.in);
        try {
            //Cosas en binario para ficheros de texto
            OutputStream flujo = new FileOutputStream("C:\\Users\\Alumno T\\Desktop\\prueba.txt", true);
            flujo.write((scan.nextLine() + "\n").getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}












