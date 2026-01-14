public class Juego {

    Juego(){

    }

    public void jugar(){
        Tablero tablero = new Tablero(10, 10, 30);

        do {
            tablero.nuevaGeneracion();
            try {
                Thread.sleep(200); // pausa 500 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while(tablero.tableroVivo());
    }
}
