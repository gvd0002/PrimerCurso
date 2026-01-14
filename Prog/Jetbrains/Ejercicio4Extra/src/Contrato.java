public class Contrato extends Documento implements Imprimible{
    public Contrato() {
        super("Contrato");
    }

    public String getTipo(){
        return super.titulo;
    }

    public void imprimir(){
        System.out.println("Esto es un " + getTipo());
    }
}
