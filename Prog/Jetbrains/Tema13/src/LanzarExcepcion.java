import java.util.Scanner;

public class LanzarExcepcion {
    static void main() {
        try {
            Scanner scan = new Scanner(System.in);
            int nota = scan.nextInt();
            if (nota < 5) {
                throw new Exception("Suspenso");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
