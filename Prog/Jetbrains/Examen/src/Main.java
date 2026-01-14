import java.util.Scanner;

public class Main {
    static void main() {


        //EJERCICIO 1 MOTOR VALIDADORES
        ValidadorBase[] validador = new ValidadorBase[3];
        validador[0] = new ValidadorLongitud();
        validador[1] = new ValidadorMayuscula();
        validador[2] = new ValidadorNumero();
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca texto: ");
        String texto = scan.nextLine();
        if(validador[0].validar(texto)) System.out.println("Validación de longitud aprobada");
        else System.out.println(validador[0].getError());

        if(validador[1].validar(texto)) System.out.println("Validación de mayúsculas aprobada");
        else System.out.println(validador[1].getError());

        if(validador[2].validar(texto)) System.out.println("Validación de números aprobada");
        else System.out.println(validador[2].getError());

        //EJERCICIO 2 FRAMEWORK

        double[] calificaciones = {10, 10, 10, 10, 10, 9.3};
        Alumno yo = new Alumno("Gonzalo", "Daw", calificaciones);
        Informe informeYo = yo.crearInforme();
        System.out.println(informeYo.toString());

    }
}














