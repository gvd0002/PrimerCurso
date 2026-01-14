public class ProcesadorMayusculas implements ProcesadorTexto{

    @Override
    public String procesar(String texto) {
        return texto.toUpperCase();
    }
}
