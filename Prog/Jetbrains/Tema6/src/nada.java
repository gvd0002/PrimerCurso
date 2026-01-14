public class nada {
    public static void main() {
        String palabra = "h3oS6l8Ga";

        int nLetras = 0, nNumeros = 0, nMayusculas = 0, nMinusculas = 0;
        String digitos = "", letras = "", mayusculas = "", minusculas = "";
        for (int i = 0; i < palabra.length(); i++) {
            Character letra = palabra.charAt(i);
            if(Character.isDigit(letra)){
                nNumeros++;
                digitos += letra;
            }
            else {
                nLetras++;
                letras += letra;
                if(Character.isUpperCase(letra)){
                    nMayusculas++;
                    mayusculas += letra;
                }
                else{
                    nMinusculas++;
                    minusculas += letra;
                }
            }
        }

        System.out.println("Hay " + nNumeros + " números que son " + digitos);
        System.out.println("Hay " + nLetras + " letras que son " + letras);
        System.out.println("Hay " + nMayusculas + " mayúsculas que son " + mayusculas);
        System.out.println("Hay " + nMinusculas + " minúsculas que son " + minusculas);

    }
}
