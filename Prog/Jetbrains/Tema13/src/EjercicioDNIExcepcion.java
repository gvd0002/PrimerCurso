public class EjercicioDNIExcepcion {
    String dni;
    public EjercicioDNIExcepcion(String dni){
        this.dni = dni;
    }
    
    public boolean comprobarFormatoDNI(){
        boolean correcto = false;
        if(comprobarDigitos() && comprobarLetra()) correcto = true;
        if(!correcto) throw new Personalizada("ERROR: El formato no es correcto");

        return correcto;
    }

    private boolean comprobarLongitud(){
        boolean correcto = false;
        if(this.dni.length() == 9) correcto = true;
        if(!correcto) throw new Personalizada("ERROR: La longitud no es correcta");

        return correcto;
    }

    private boolean comprobarDigitos(){
        boolean correcto = true;
        if(comprobarLongitud()){
            for (int i = 0; i < 8; i++) {
                if(!Character.isDigit(dni.charAt(i))){
                    correcto = false;
                }
            }
        }
        if(!correcto) throw new Personalizada("ERROR: Los dígitos no son correctos");

        return correcto;
    }

    private boolean comprobarLetra(){
        boolean correcto = false;
        if(comprobarLongitud()){
            if(Character.isUpperCase(this.dni.charAt(8))) correcto = true;
        }
        if(!correcto) throw new Personalizada("ERROR: La letra no es correcta");
        return correcto;
    }

    static void main() {
        try{
            EjercicioDNIExcepcion dni = new EjercicioDNIExcepcion("123456A");
            if(dni.comprobarFormatoDNI()) System.out.println("Es correcto");;

        }
        catch (Personalizada e){
            System.out.println(e);
        }

    }
}
