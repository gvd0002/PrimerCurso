import java.io.File;
import java.io.IOException;

public class EjemploDirectorios {
    static void main() throws IOException {
        File archivo = new File("prueba");
        archivo.mkdir();
        /*for (int i = 0; i < 10; i++) {
            File archivoaux = new File("prueba/archivo" + i + ".txt");
            archivoaux.createNewFile();
        }*/
        for (int i = 0; i < archivo.listFiles().length; i++) {

            if(!archivo.listFiles()[i].getName().contains(".txt")){
            //if(!archivo.listFiles()[i].getName().substring(archivo.listFiles().length-5, archivo.listFiles().length-1).equals(".txt")){
                archivo.listFiles()[i].delete();
                i--;
            }
        }
    }
}