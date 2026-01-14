import java.util.Scanner;
import java.lang.Math;

public class Ejercicio1 {
    public static void main(String[] args){
        //Pedir el radio de un circulo y calcular su area

        System.out.println("Escriba el radio del círculo: ");
        Scanner escaneo = new Scanner(System.in);
        double radio = escaneo.nextDouble();

        double area = Math.PI*Math.pow(radio,2);

        System.out.println("El área del circulo es: \n" + area);
    }
}
