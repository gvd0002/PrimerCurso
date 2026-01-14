public class calcularModa {
    public static void main() {
        int valores[] = {2,4,8,3,1,1,4,6,8,5,3,2,1,4,7,8,2,3,6,1};

        System.out.println("Vamos a calcular la moda entre los siguientes valores:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();

        int a[] = {0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < valores.length; i++) {
            a[valores[i]]++;
        }
        int mayor = 0;
        for (int i = 1; i < a.length; i++) {
            if(a[mayor] <= a[i])
                mayor = i;
        }
        int maximo = a[mayor];

        System.out.print("El número que mas se repite es el " );
        for (int i = 0; i < a.length; i++) {
            if (a[i] == maximo)
                System.out.print(i + " un total de " + maximo + " veces ");
        }
    }
}
