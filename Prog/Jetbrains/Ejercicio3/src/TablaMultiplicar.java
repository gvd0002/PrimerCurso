import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        int valor;
        do{
            System.out.println("Escriba un numero entre 0 y 10");
            valor = scan.nextInt();
        }
        while(valor < 0 || valor > 10);

        for(int i = 1; i < 11; i++){
            System.out.println(valor + "x" + i + " = " + (valor*i));
        }
    }
}
