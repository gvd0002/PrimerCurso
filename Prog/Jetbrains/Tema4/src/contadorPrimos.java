public class contadorPrimos {
    public static void main() {
        int a = 7;
        int totalPrimos = contarPrimos(a);
        System.out.println("Hay en total " + totalPrimos + " divisores primos de " + a);
    }

    public static int contarPrimos(int a){
        int contador = 0;

        for(int i = 2; i <= (a+1)/2; i++){
            if(a%i == 0 && esPrimo(i)){
                contador++;
            }
        }

        return contador;
    }

    public static boolean esPrimo(int a){
        boolean primo = true;

        for(int i = 2; i <= (a+1)/2; i++){
            if(a%i == 0){
                primo = false;
            }
        }
        return primo;
    }
}
