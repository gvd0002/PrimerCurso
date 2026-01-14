import java.util.Scanner;

public class Main {
    static void main() {
        ProcesadorTexto[] procesadores = new ProcesadorTexto[2];
        procesadores[0] = new ProcesadorMayusculas();
        procesadores[1] = new ProcesadorSinEspacios();

        String texto = "Lleva la tarara un vestido blanco lleno de cascabeles";
        System.out.println(procesadores[0].procesar(texto));
        System.out.println(procesadores[1].procesar(texto));


    }
}
