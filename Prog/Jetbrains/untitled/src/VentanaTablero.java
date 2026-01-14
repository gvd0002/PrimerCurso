import javax.swing.*;
import java.awt.*;

public class VentanaTablero {
    private JFrame frame;
    PanelTablero panelTablero;
    JPanel panelControles;
    JButton btnIniciar, btnPausar, btnReiniciar;

    public VentanaTablero(int filas, int columnas, int tamañoCelula){
        frame = new JFrame("Juego de la Vida - Cuadricula");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        panelTablero = new PanelTablero(filas, columnas, tamañoCelula);
        frame.add(panelTablero, BorderLayout.CENTER);

        panelControles = new JPanel();
        btnIniciar = new JButton("Iniciar");
        btnPausar = new JButton("Pausar");
        btnReiniciar = new JButton("Reiniciar");

        panelControles.add(btnIniciar);
        panelControles.add(btnPausar);
        panelControles.add(btnReiniciar);
        frame.add(panelControles, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }


}
