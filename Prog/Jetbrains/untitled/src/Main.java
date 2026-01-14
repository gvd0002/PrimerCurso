import javax.swing.*;

public class Main {
    static void main() {
        SwingUtilities.invokeLater(() -> {
            int filas = 10;
            int columnas = 10;
            int tamañoCelula = 30;
            new VentanaTablero(filas, columnas, tamañoCelula);
        });
    }
}
