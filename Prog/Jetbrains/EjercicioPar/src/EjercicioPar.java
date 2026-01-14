import java.util.Scanner;
public class EjercicioPar {
    public static void main(String[] args){

        System.out.println("Introduzca valor: \n");

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        if(x%2 == 0)
            System.out.println(x + " Es par");
        else System.out.println(x + " No es par");

    }
}
