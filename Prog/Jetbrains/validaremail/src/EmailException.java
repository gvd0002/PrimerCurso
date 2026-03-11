public class EmailException extends RuntimeException {
    public EmailException(String message) {
        super(message);
    }

    public String toString(){
        return this.getMessage();
    }
}
