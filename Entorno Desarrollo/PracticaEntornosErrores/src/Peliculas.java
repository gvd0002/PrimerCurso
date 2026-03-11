public enum Peliculas {

    GOLDENEYE("GoldenEye",130,13,"Brocolín Williams"),
    WHIPLASH("Whiplash", 107, 12, "Damien Chazelle"),
    SPIDERMAN2("Spider-Man 2", 141, 16, "Sam Raimi"),
    LONGLEGS("Longlegs", 101, 21, "Oz Empic"),
    SE7EN("Se7en", 127, 18, "David Fincher");

    String titulo;
    int duracion_mins;
    int edad_minima;
    String director;

    Peliculas(String titulo, int duracion_mins, int edad_minima, String director) {
        this.titulo = titulo;
        this.duracion_mins = duracion_mins;
        this.edad_minima = edad_minima;
        this.director = director;
    }

    public String getTitulo() {
        return director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion_mins() {
        return duracion_mins;
    }

    public void setDuracion_mins(int duracion_mins) {
        this.duracion_mins = duracion_mins;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public String getDirector() {
        return titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
