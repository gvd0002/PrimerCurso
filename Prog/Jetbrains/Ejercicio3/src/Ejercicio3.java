import java.util.Scanner;
import java.lang.Math;

//Crea una función que reciba días, horas, minutos y segundos (como enteros)
//y retorne su resultado en milisegundos.

public class Ejercicio3{
    public static void main(String[] args) {
        System.out.println("Escriba dias, horas, minutos y segundos: ");
        Scanner escaneo = new Scanner(System.in);
        int dias = escaneo.nextInt();
        int horas = escaneo.nextInt();
        int minutos = escaneo.nextInt();
        int segundos = escaneo.nextInt();

        double

                total = dias*24*60*60*1000 + horas*60*60*1000 + minutos*60*1000 + segundos*1000;
        System.out.println("El total de milisegundos son: " + total);
    }
}
