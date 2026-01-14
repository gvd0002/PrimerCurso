public class Cine {
    Pelicula [] pelis;
    int numPelis;

    public Cine() {
        this.numPelis = 0;
        this.pelis = new Pelicula[5];
    }

    public void aniadirPeli(Pelicula peliNueva){
        this.pelis[numPelis] = peliNueva;
        this.numPelis++;
    }

}
