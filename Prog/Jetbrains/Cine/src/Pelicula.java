public class Pelicula {
    String titulo;
    int duracion;
    int edadMin;
    String director;
    double precio;


    public Pelicula(String titulo, String director, int duracion, int edadMin, double precio) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.precio = precio;
    }

    public int getEdadMin(){
        return this.edadMin;
    }

    public double getPrecio(){
        return this.precio;
    }

    public String toString(){
        return " Título: " + this.titulo + "\n Director: " + this.director + "\n Duración: " + this.duracion + "\n Edad Mínima: " + this.edadMin;
    }
}
