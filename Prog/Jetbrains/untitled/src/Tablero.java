import java.util.Random;
public class Tablero {

    boolean [][] generacionActual;
    boolean [][] generacionSiguiente;
    boolean [][] generacionResiduo;
    int filas;
    int columnas;
    int celulasIniciales;

    public Tablero(int filas, int columnas, int celulasIniciales) {
        this.generacionActual = new boolean[filas][columnas];
        this.generacionSiguiente = new boolean[filas][columnas];
        this.generacionResiduo = new boolean[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
        this.celulasIniciales = celulasIniciales;

        for (int i = 0; i < this.generacionActual.length; i++) {
            for (int j = 0; j < this.generacionActual[i].length; j++) {
                this.generacionActual[i][j] = false;
                this.generacionSiguiente[i][j] = false;
                this.generacionResiduo[i][j] = false;
            }
        }
        crearVida();
        mostrarGeneracion(this.generacionActual);
    }

    public void crearVida(){
        int valorI = 0;
        int valorJ = 0;
        Random valor = new Random();

        for (int i = 0; i < this.celulasIniciales; i++) {
            valorI = valor.nextInt(this.filas);
            valorJ = valor.nextInt(this.columnas);
            generacionActual[valorI][valorJ] = true;
        }
    }

    public void mostrarGeneracion(boolean [][] generacion){
        System.out.println("------------");
        for (int i = 0; i < generacion.length; i++) {
            System.out.print("|");
            for (int j = 0; j <generacion[i].length ; j++) {
                if(generacion[i][j] == true)
                    System.out.print("X");
                else System.out.print(".");
            }
            System.out.println("|");
        }
        System.out.println("------------");
    }

    public void nuevaGeneracion(){

        copiarGeneracion(this.generacionResiduo, this.generacionActual);
        for (int i = 0; i < this.generacionSiguiente.length; i++) {
            for (int j = 0; j < this.generacionSiguiente[i].length; j++) {
                if(this.generacionActual[i][j] == true){ //si es célula viva
                    boolean sobrevive = Celula.comprobarSupervivencia(this.generacionActual, i, j);
                    this.generacionSiguiente[i][j] = sobrevive;
                }
                else{
                    boolean nace = Celula.comprobarNacimiento(this.generacionActual, i, j);
                    this.generacionSiguiente[i][j] = nace;
                }
            }
        }

        mostrarGeneracion(this.generacionSiguiente);
        copiarGeneracion(this.generacionActual, this.generacionSiguiente);
    }

    public void copiarGeneracion(boolean[][] generacion1, boolean [][] generacion2){
        for (int i = 0; i < generacion1.length; i++) {
            for (int j = 0; j < generacion1[i].length; j++) {
                generacion1[i][j] = generacion2[i][j];
            }
        }
    }

    public boolean tableroVivo(){
        boolean vivo = false;

        for (int i = 0; i < this.generacionSiguiente.length; i++) {
            for (int j = 0; j < this.generacionSiguiente[i].length; j++) {
                if(this.generacionSiguiente[i][j]) vivo = true;
            }
        }

        if(this.mismaGeneracion()) vivo = false;

        return vivo;
    }

    public boolean mismaGeneracion(){
        boolean igual = true;
        for (int i = 0; i < this.generacionSiguiente.length; i++) {
            for (int j = 0; j < this.generacionSiguiente[i].length; j++) {
                if(this.generacionActual[i][j] != this.generacionResiduo[i][j]) igual = false;
            }
        }

        return igual;
    }
}
