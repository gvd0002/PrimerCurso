public class Main {
    static void main() {
        ValidadorEmail email = new ValidadorEmail("blaschupapollasnegras69@alu.medac.es");
        try{
            if(email.validarEmail()) System.out.println("El email: " + email.getEmail() + " es correcto");
        }
        catch (EmailException e){
            System.out.println(e);

        }
    }
}
