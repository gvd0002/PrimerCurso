public class ValidadorLongitud extends ValidadorBase {


    public ValidadorLongitud() {
        super("Error: No tiene la longitud suficiente");
    }

    public boolean validar(String texto){
        boolean condicion = false;

        if(texto.length() >= 8) condicion = true;

        return condicion;
    }
}
