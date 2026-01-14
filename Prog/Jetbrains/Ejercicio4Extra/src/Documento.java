public abstract class Documento {
    String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    abstract String getTipo();
}
