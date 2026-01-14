public class ValidadorNumero extends ValidadorBase {


    public ValidadorNumero() {
        super("Error: No tiene ningún número");
    }

    public boolean validar(String texto){
        boolean condicion = false;


        for (int i = 0; i < texto.length(); i++) {
            Character letra = texto.charAt(i);
            if (Character.isDigit(letra)) condicion = true;
        }
        return condicion;
    }
}
