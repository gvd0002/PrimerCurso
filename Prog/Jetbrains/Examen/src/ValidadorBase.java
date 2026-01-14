public abstract class ValidadorBase implements Validador{
    String error;

    public ValidadorBase(String error) {
        this.error = error;
    }

    String getError(){
        return this.error;
    }

    public abstract boolean validar(String texto);
}
