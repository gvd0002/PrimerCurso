public class Main {
    static void main() {
        Pagable[] pagables = new Pagable[2];
        EmpleadoFijo paco = new EmpleadoFijo("Paco");
        EmpleadoPorHoras jose = new EmpleadoPorHoras("Jose");
        pagables[0] = paco;
        pagables[1] = jose;


        System.out.println("El empleado " + paco.getTipo() + " ha cobrado " + pagables[0].calcularPago());
        System.out.println("El empleado " + jose.getTipo() + " ha cobrado " + pagables[0].calcularPago());

    }
}
