public class ProcesadorSinEspacios implements ProcesadorTexto{

    @Override
    public String procesar(String texto) {
        return texto.replace(" ", "");
    }
}
