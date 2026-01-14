import java.util.Scanner;

public class Sala {
    String [][] asientos;
    boolean [][] ocupados;
    Espectador [][] personas;
    Pelicula peli;
    final String ROJO = "\u001B[31m";
    final String VERDE = "\u001B[32m";
    final String AZUL = "\u001B[34m";
    final String RESET = "\u001B[0m";

    public Sala(Pelicula peli) {
        this.asientos = new String[9][9];
        this.ocupados = new boolean[9][9];
        this.personas = new Espectador[9][9];
        this.peli = peli;
        for (int i = 0; i < this.asientos.length; i++) {
            for (int j = 0; j < this.asientos[i].length; j++) {
                char c = (char) (65 + j);
                this. asientos[i][j] = (this.asientos.length - i) + "" + c;
                this.ocupados[i][j] = false;
            }
        }
    }

    public void mostrarSala(){
        System.out.println(AZUL + "---------------------------------------------------------" + RESET);
        System.out.println(peli);
        System.out.println(AZUL + "---------------------------------------------------------" + RESET);
        for (int i = 0; i < this.asientos.length; i++) {
            for (int j = 0; j < this.asientos[i].length; j++) {
                if(this.asientos[i][j].equals("XX")){
                    System.out.print(ROJO + this.asientos[i][j] + RESET + " ");
                }
                else {
                    System.out.print(VERDE + this.asientos[i][j] + RESET + " ");
                }
            }
            System.out.println();
        }
        System.out.println("---------PANTALLA---------");
    }

    public void spreadEspectadores(Espectador[] espectadores){
        int fila;
        int columna;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < espectadores.length; i++) {
            if(espectadores[i].getEdad() < peli.getEdadMin()){
                System.out.println("El espectador " + espectadores[i].toString() + " no puede ver esta película porque es menor");
            }
            else {
                if(espectadores[i].getDinero() < peli.getPrecio()){
                    System.out.println("El espectador " + espectadores[i].toString() + " no puede ver esta película porque no tiene dinero suficiente");
                }
                else {
                    System.out.println("Quiere sitio aleatorio para el espectador " + espectadores[i] + "?");
                    String decision = scan.next();
                    if(decision.equals("s") || decision.equals("si") || decision.equals("Si") || decision.equals("SI")){
                        do {
                            fila = (int) ((Math.random() * (8)));
                            columna = (int) ((Math.random() * (8)));
                        }
                        while(this.ocupados[fila][columna]);
                        this.personas[fila][columna] = espectadores[i];
                        this.ocupados[fila][columna] = true;
                        this.asientos[fila][columna] = "XX";
                    }
                    else {
                        do {
                            char c = (char) (65 + asientos[0].length -1);
                            System.out.println("Indique fila(1-" + asientos.length + ") y butaca(A-" + c + "):");

                            String asiento = scan.next();
                            fila = asientos.length - (asiento.charAt(0) - 48);
                            columna = asiento.charAt(1) - 65;

                            if(ocupados[fila][columna])
                                System.out.println("El asiento está ocupado");
                        }while(ocupados[fila][columna]);
                        this.personas[fila][columna] = espectadores[i];
                        this.ocupados[fila][columna] = true;
                        this.asientos[fila][columna] = "XX";
                    }
                    mostrarSala();
                }
            }
        }
    }
}
