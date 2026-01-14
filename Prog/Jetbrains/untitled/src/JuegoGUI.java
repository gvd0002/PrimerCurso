import javax.swing.*;
import java.awt.*;
public class JuegoGUI {
    private VentanaTablero ventana;
    private Tablero tablero;
    private Timer timer;
    private boolean corriendo = false;
    private int tamañoCelula;

    JuegoGUI(int filas, int columnas, int tamañoCelula, int celulasIniciales){
        this.tablero = new Tablero(filas,columnas,celulasIniciales);
        this.tamañoCelula = tamañoCelula;
        ventana = new VentanaTablero(filas, columnas, tamañoCelula);

        timer = new Timer(250, e -> {
            if(corriendo){
                tablero.nuevaGeneracion();
                ventana.panelTablero.repaint();
            }
        });

        ventana.btnIniciar.addActionListener(e ->{
            corriendo = true;
            timer.start();
        });

        ventana.btnPausar.addActionListener(e -> corriendo = false);

        ventana.btnReiniciar.addActionListener(e ->{
            corriendo = false;
            timer.stop();
            tablero = new Tablero(filas,columnas,celulasIniciales);
            ventana.panelTablero.repaint();
        });

        ventana.panelTablero.setTablero(tablero);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new JuegoGUI(100, 100, 5, 1000));
    }
}
