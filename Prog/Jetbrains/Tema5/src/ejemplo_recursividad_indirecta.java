public class ejemplo_recursividad_indirecta {

        // Primera función recursiva
        public static double fibonacciA(int n) {
            if (n == 0) {
                return 0; // Caso base
            } else if (n == 1) {
                return 1; // Caso base
            } else {
                // Llama a la otra función
                return fibonacciB(n - 1) + fibonacciB(n - 2);
            }
        }

        // Segunda función recursiva
        public static double fibonacciB(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                // Llama de nuevo a la primera
                return fibonacciA(n - 1) + fibonacciA(n - 2);
            }
        }

        public static void main(String[] args) {
            int numero = 25;
            System.out.println("Fibonacci de " + numero + " es: " + fibonacciA(numero));

            // Mostrar varios valores de la secuencia
            System.out.print("Serie de Fibonacci hasta " + numero + ": ");
            for (int i = 0; i <= numero; i++) {
                System.out.print(fibonacciA(i) + " ");
            }
        }
    }

