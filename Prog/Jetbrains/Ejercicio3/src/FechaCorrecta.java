import java.util.Scanner;
public class FechaCorrecta {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba día mes y año\n");
        int dia = scan.nextInt();
        int mes = scan.nextInt();
        int anio = scan.nextInt();

        boolean valida = false;
        //1. compruebo si el año es bisiesto para comprobar el 29 de febrero
        //2. si no es bisiesto compruebo que febrero tenga 28 dias
        //3. si no es febr

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){//Si es mes con 31 dias
            if (dia < 32 && dia > 0)  //Si tiene entre 1 y 31 dias
                valida = true;
        }
        else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia < 31 && dia > 0)
                    valida = true;
            } else {
                if (mes == 2) {
                    if ((anio % 4 == 0 && !(anio % 100 == 0)) || anio % 400 == 0) {
                        if (dia < 30 && dia > 0)
                            valida = true;
                    }
                    else{
                        if(dia < 29 && dia > 0)
                            valida = true;
                    }
                }
            }
        }
        if(valida)
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es valida");
        else System.out.println("No es válida");
    }
}
