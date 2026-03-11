import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
    static void main() {
        try {
            RandomAccessFile fichero = new RandomAccessFile("C:\\Users\\Alumno T\\Desktop\\prueba.dat", "rw");
            fichero.writeInt(20);
            fichero.writeUTF("Hola");
            fichero.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
