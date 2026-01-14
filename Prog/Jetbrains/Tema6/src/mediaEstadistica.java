public class mediaEstadistica {
    public static void main() {
        double unidades[] = {2.5, 9.3, 6.4, 7.3, 5.2, 7.3, 6.2};

        double total = 0;
        System.out.print("Las calificaciones son: ");
        for (int i = 0; i < unidades.length; i++) {
            total += unidades[i];
            System.out.print(unidades[i] + " ");
        }
        System.out.println();

        System.out.println("La media aritmética es: " + total/ unidades.length);
    }
}
