public class Main {
    static void main() {
        /*Usuario yo = new Usuario("Pepe", 30);
        Usuario yo1 = new Usuario("Jose", 73);
        Usuario yo2 = new Usuario("Juan", 61);
        Usuario yo3 = new Usuario("Alejandro", 27);
        Usuario yo4 = new Usuario("Anotnio", 39);

        Usuario[] array = {yo, yo1, yo2, yo3, yo4};

        for(Usuario user:array){
            System.out.println(user.mostrarDatos());

        }*/
        FiguraColoreada objeto1 = new Cuadrado(5, "Blanco");
        System.out.println("El area es " + objeto1.calcularArea());
        System.out.println("Es de color " + objeto1.getColor());
    }
}
