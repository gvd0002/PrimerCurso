public class mayorDe3 {
    public static void main() {
        int a = 10 , b = 40 , c = 20;

        //int mayor = mayor(a, b, c);
        System.out.println("El mayor es: " + mayor(a, b, c));
    }

    public static int mayor(int a, int b, int c){
        int maximo;
        if(a > b && a > c)
            maximo = a;
        else {
            if (b > a && b > c)
                maximo = b;
            else
                maximo = c;
        }
        return maximo;
    }
}
