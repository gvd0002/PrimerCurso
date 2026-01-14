import java.lang.Math;

public class Contrasenia {
    int longitud;
    String password;

    public Contrasenia(int longitud) {
        this.longitud = longitud;
        this.password = this.generarContrasenia();
    }

    public Contrasenia() {
        this.longitud = 8;
        this.password = this.generarContrasenia();
    }




    public String generarContrasenia(){
        String contrasenia = "";
        for (int i = 0; i < this.longitud; i++) {
            int ascii = (int) ((Math.random()*(122-48))+48);
            char c = (char) ascii;
            contrasenia += c;
        }
        return contrasenia;
    }

    public String esFuerte(){
        int nLetras = 0, nNumeros = 0, nMayusculas = 0, nMinusculas = 0;
        String resultado = "";

        for (int i = 0; i < this.password.length(); i++) {
            Character letra = this.password.charAt(i);
            if(Character.isDigit(letra)){
                nNumeros++;
            }
            else {
                nLetras++;
                if(Character.isUpperCase(letra)){
                    nMayusculas++;
                }
                else{
                    nMinusculas++;
                }
            }
        }

        if(this.longitud < 8){
            resultado = "Muy débil";
        }
        else {
            if(nMinusculas == this.longitud){
                resultado = "Débil";
            }
            else{
                if(nMayusculas > 0 && nNumeros == 0){
                    resultado = "Fuerte";
                }
                else {
                    if(nMayusculas > 0 && nNumeros > 0){
                        resultado = "Muy fuerte";
                    }
                }
            }

        }
        return resultado;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getPassword() {
        return password;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.password = this.generarContrasenia();
    }
}