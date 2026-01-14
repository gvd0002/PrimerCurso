import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        int valor;

        System.out.println("Escriba un valor (0 para salir): \n");
        valor = scan.nextInt();

        while(valor != 0){
            if(valor < 0){
                System.out.println("Es negativo");
            }
            else{
                if(valor > 0)
                    System.out.println("Es positivo");
            }
            System.out.println("Escriba otro valor (0 para salir): \n");
            valor = scan.nextInt();
        }
        System.out.println("Es 0");
    }
}
