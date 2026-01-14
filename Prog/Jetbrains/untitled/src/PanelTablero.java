import javax.swing.*;
import java.awt.*;
public class PanelTablero extends JPanel{

    private int filas;
    private int columnas;
    private int tamañoCelula;
    private Tablero tablero;

    PanelTablero(int filas, int columnas, int tamañoCelula){
        this.filas = filas;
        this.columnas = columnas;
        this.tamañoCelula = tamañoCelula;

        setPreferredSize(new Dimension(columnas * tamañoCelula, filas * tamañoCelula));
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        if (tablero != null) {
            for (int i = 0; i < tablero.filas; i++) {
                for (int j = 0; j < tablero.columnas; j++) {
                    if (tablero.generacionActual[i][j])
                        g.setColor(Color.BLACK);
                    else
                        g.setColor(Color.WHITE);

                    g.fillRect(j * tamañoCelula, i * tamañoCelula, tamañoCelula, tamañoCelula);
                    g.setColor(Color.GRAY);
                    g.drawRect(j * tamañoCelula, i * tamañoCelula, tamañoCelula, tamañoCelula);
                }
            }
        }
    }

    public void setTablero(Tablero t){
        this.tablero = t;
    }

}
