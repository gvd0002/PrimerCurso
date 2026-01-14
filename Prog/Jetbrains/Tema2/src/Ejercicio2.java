import java.util.Scanner;
import java.lang.Math;

public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("Escriba la primer dia, mes y año: ");
        Scanner escaneo = new Scanner(System.in);
        int dia1 = escaneo.nextInt();
        int mes1 = escaneo.nextInt();
        int anio1 = escaneo.nextInt();

        int total1 = dia1+mes1*30+anio1*(12*30);

        System.out.println("Escriba el segundo dia, mes y año: ");
        int dia2 = escaneo.nextInt();
        int mes2 = escaneo.nextInt();
        int anio2 = escaneo.nextInt();

        int total2 = dia2+mes2*30+anio2*(12*30);

        System.out.println("La diferencia de días es: " + Math.abs(total1-total2) + " dia/s");
    }
}
