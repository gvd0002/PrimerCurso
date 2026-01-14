import java.util.Scanner;

public class Primo {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Introduzca un valor: \n");
            valor = scan.nextInt();
        }
        while(valor <= 1);

        boolean primo = true;
        for(int i = 2; i < (valor+1)/2; i++){
            if(valor%i == 0){
                primo = false;
            }
        }

        if(primo)
            System.out.println("El numero " + valor + " es primo");
        else    System.out.println("El numero " + valor + " no es primo");

    }
}
