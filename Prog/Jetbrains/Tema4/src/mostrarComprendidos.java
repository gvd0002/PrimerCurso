import java.sql.SQLOutput;

public class mostrarComprendidos {
    public static void main() {
        int a = 7, b = 100;
        mostrarIntervalo(a, b);
    }

    public static void mostrarIntervalo(int a, int b){
        if(a > b){
            int aux = b;
            b = a;
            a = aux;
        }
        for(int i = a; i <= b; i++){
            System.out.println(i);
        }
    }
}
