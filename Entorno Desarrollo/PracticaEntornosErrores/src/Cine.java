public class Cine {

    Peliculas pelicula;
    double precio_entrada;
    Asiento[][] sala;

    public Cine(Peliculas pelicula, double precio_entrada) {
        this.pelicula = pelicula;
        this.precio_entrada = precio_entrada;
        this.sala = generarSala();
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio_entrada() {
        return precio_entrada;
    }

    public void setPrecio_entrada(double precio_entrada) {
        this.precio_entrada = precio_entrada;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public Asiento[][] generarSala(){

        Asiento[][] sala = new Asiento[8][9];

        int fila_sala = 8;

        for (int i = 0; i < sala.length; i++) {

            int cont = 65;

            for (int j = 0; j < sala[i].length; j++) {

                char columna = ((char)(cont));
                Asiento asiento = new Asiento();
                int[] posicion = {i,j};

                asiento.setPosicion(posicion);

                if ((i <= 5) && (j == 0 || j == 1)){

                    asiento.setOcupado(true);
                    asiento.setValor("--");

                } else {

                    asiento.setOcupado(false);
                    asiento.setValor(String.valueOf(fila_sala)+columna);

                }

                sala[i][j] = asiento;
                cont++;

            }

            fila_sala--;

        }

        return sala;
    }

    public void mostrarSala(){

        for (int x = 0; x < this.sala.length; x++) {

            String recordatorio = "";

            for (int y = 0; y < this.sala[x].length; y++) {

                recordatorio += "[" + this.sala[x][y].valor + "]" + " ";

            }

            System.out.println(recordatorio + " ");

        }
    }

    public void ocuparAsiento(Asiento asiento, int[] posicion, String persona){

        asiento.setPosicion(posicion);
        asiento.setOcupado(true);
        asiento.setValor(persona);

        int fila = asiento.posicion[0];
        int columna = asiento.posicion[1];

        this.sala[fila][columna].valor = asiento.valor;

    }

}
