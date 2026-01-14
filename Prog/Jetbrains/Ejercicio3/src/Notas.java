import java.util.Scanner;
public class Notas {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        double nota;

        do{
            System.out.println("Escriba una nota entre 0 y 10");
            nota = scan.nextDouble();
        }
        while(nota < 0 || nota > 10);


        if (nota < 5)
            System.out.println("La calificacion es Insuficiente");
        else{
            if(nota <6)
                System.out.println("La calificacion es Suficiente");
            else{
                if(nota < 7)
                    System.out.println("La calificacion es Notable");
                else{
                    if(nota <9)
                        System.out.println("La calificacion es Sobresaliente");

                    else System.out.println("La calificacion es Sobresaliente Alto");

                }
            }
        }

    }
}
