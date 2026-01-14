import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class DecimalBinario {
    /*public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        int decimal;
        do{
            System.out.println("Escriba un número positivo");
            decimal = scan.nextInt();
        }
        while(decimal < 0);

        ArrayList<Integer> binario = new ArrayList<Integer>();

        while(decimal > 1){
            binario.add(decimal%2);
            decimal /= 2;
        }

        binario.add((decimal+1)/2);

        for(int i = binario.size()-1; i >= 0; i--){
            System.out.print(binario.get(i));
        }
    }*/
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        int decimal;
        do{
            System.out.println("Escriba un número positivo");
            decimal = scan.nextInt();
        }
        while(decimal < 0);

        int binario = 0, digito, iter = 0;
        while(decimal > 1){
            digito = decimal%2;
            binario += digito*Math.pow(10,iter);
            iter++;
            decimal /= 2;
        }
        System.out.println(binario);
    }
}
