public class Factura extends Documento implements Imprimible{

    public Factura() {
        super("Factura");
    }

    public String getTipo(){
        return super.titulo;
    }

    public void imprimir(){
        System.out.println("Esto es una " + getTipo());
    }
}
