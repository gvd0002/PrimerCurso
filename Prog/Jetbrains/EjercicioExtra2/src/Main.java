import java.util.Scanner;

public class Main {
    static void main() {

        Usuario paco = new Usuario("Paco", "1234");
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca usuario: ");
        String nombre = scan.nextLine();
        System.out.println("Introduzca contraseña: ");
        String passwd = scan.nextLine();

        if(paco.autenticar(nombre, passwd)) {System.out.println("Verificación correcta");}
        else { System.out.println("Usuario o contraseña incorrecto");}

    }
}
