public enum dominios {
    OUTLOOK("outlook"),
    GMAIL("gmail"),
    YAHOO("yahoo"),
    ALU_MEDAC("alu.medac"); // aunque tenga punto, lo ponemos como valor

    private final String valor;

    dominios(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}