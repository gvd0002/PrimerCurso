import java.util.Scanner;
public class Ohm {
    public static void main(String[] argv){
        //V=I*R
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba los valores V I R");

        int x = scan.nextInt();
        int y = scan.nextInt();

        //Si V desconocido I=x R=y
        System.out.println("V: " + x*y + " I: " + x + " R: " + y);

        //Si V desconocido I=y R=x
        System.out.println("V: " + x*y + " I: " + x + " R: " + y);

        //Si I desconocido V=x R=y
        System.out.println("V: " + x*y + " I: " + x + " R: " + y);

        //Si I desconocido V=y R=x
        System.out.println("V: " + x*y + " I: " + x + " R: " + y);

        //Si R desconocido V=x I=y
        System.out.println("V: " + x*y + " I: " + x + " R: " + y);

        //Si R desconocido V=y I=x
        System.out.println("V: " + x*y + " I: " + x + " R: " + y);



    }
}
