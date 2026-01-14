import java.lang.Math;
public class areaCuadrado {
    public static void main() {
        int lado = 2;

        System.out.println("El area es: " + area(lado));
    }

    public static double area(int lado){
        return Math.pow(lado, 2);
    }
}
