import java.util.Scanner;

public class ContadorCifras {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        int valor;

        do{
            System.out.println("Escriba un valor entre 0-9999 \n");
            valor = scan.nextInt();
        }
        while(valor < 0 || valor > 9999);

        int cifras = 0;
        int aux = valor;
        for(int i = 0; aux > 0; i++){
            aux /= 10;
            cifras++;
        }

        System.out.println("El valor " + valor + " tiene " + cifras + " cifras");
    }
}

