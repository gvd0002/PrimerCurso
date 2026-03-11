public class ValidadorEmail {

    String email;
    int posArroba;
    int posPuntoExtension;
    public ValidadorEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public boolean validarEmail(){
        boolean resultado = false;
        this.posArroba = 0;
        this.posPuntoExtension = 0;

        if(validarArroba() &&
                validarDominio() &&
                validarExtension())
            resultado = true;

        return resultado;
    }

    public boolean validarArroba(){
        char a;
        int contadorArrobas = 0;
        boolean resultado = true;
        for (int i = 0; i < this.email.length()-1; i++) {
            a = this.email.charAt(i);
            if(a == '@'){
                this.posArroba = i;
                contadorArrobas++;
            }
        }
        if(contadorArrobas != 1){
            throw new EmailException("Error: No hay un solo @");
        }

        String usuario = this.email.substring(0, this.posArroba);
        if(usuario.contains(" "))
            throw new EmailException("Error: El usuario no es correcto");
        return resultado;
    }

    public boolean validarDominio(){
        boolean resultado = false;
        this.posPuntoExtension = this.email.lastIndexOf(".");
        String dominioProvisional = this.email.substring(this.posArroba+1, this.posPuntoExtension);
        for(dominios dominio: dominios.values()){
            if(dominioProvisional.equals(dominio.toString())){
                resultado = true;
            }
        }
        if(!resultado) throw new EmailException("Error: el dominio no es válido");
        return resultado;
    }

    public boolean validarExtension(){
        String extensionProvisional = this.email.substring(this.posPuntoExtension+1);
        boolean resultado = false;
        for (extensiones extension: extensiones.values()){
            if(extensionProvisional.equals(extension.toString())){
                resultado = true;
            }
        }
        if(!resultado) throw new EmailException("Error: La extensión no es válida");
        return resultado;
    }
}
