public class Personalizada extends RuntimeException {
    public Personalizada(String message) {
        super(message);
    }

    public String toString(){
        return this.getMessage();
    }
}
