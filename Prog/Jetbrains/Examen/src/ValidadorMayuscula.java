public class ValidadorMayuscula extends ValidadorBase{


    public ValidadorMayuscula() {
        super("Error: No tiene ninguna mayúscula");
    }

    public boolean validar(String texto){
        boolean condicion = false;


        for (int i = 0; i < texto.length(); i++) {
            Character letra = texto.charAt(i);
            if (Character.isUpperCase(letra)) condicion = true;
        }
        return condicion;
    }
}
