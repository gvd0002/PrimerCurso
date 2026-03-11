import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        // Creación de salas

        Scanner teclado = new Scanner(System.in);

        Cine sala1 = new Cine(Peliculas.GOLDENEYE, 13.99);
        Cine sala2 = new Cine(Peliculas.SPIDERMAN2, 13.99);
        Cine sala3 = new Cine(Peliculas.WHIPLASH, 13.99);
        Cine sala4 = new Cine(Peliculas.LONGLEGS, 13.99);
        Cine sala5 = new Cine(Peliculas.SE7EN, 13.99);
        Cine[] cine = {sala5, sala4, sala1, sala3, sala2};
        int opcion = 0;

        // Ocupacion de asientos

        while (opcion!=5){

            System.out.println("Bombero: Buenos días, ¿Qué tal se encuentra el armadillo morado?:");
            System.out.println("1. " + Peliculas.GOLDENEYE.titulo);
            System.out.println("2. " + Peliculas.SPIDERMAN2.titulo);
            System.out.println("3. " + Peliculas.WHIPLASH.titulo);
            System.out.println("4. " + Peliculas.LONGLEGS.titulo);
            System.out.println("5. Vaya mierda de cartelera, y que precios por dios. Que le follen, adios...");
            opcion = teclado.nextInt();

            if (opcion==5){
                break;
            }

            Espectador espectador = crearEspectador(cine[opcion-1]);

            if (espectador==null){
                System.out.println("Espectador: Adios...");
                pausa();
                break;
            }

            comprobarSala(cine, opcion, espectador);

        }
        System.out.println("Resultado de las salas:");

        System.out.println("Sala 1:");
        cine[0].mostrarSala();
        pausa();
        System.out.println("Sala 2:");
        cine[1].mostrarSala();
        pausa();
        System.out.println("Sala 3:");
        cine[2].mostrarSala();
        pausa();
        System.out.println("Sala 4:");
        cine[3].mostrarSala();
        pausa();
        System.out.println("Sala 5:");
        cine[4].mostrarSala();
    }

    public static int[] traducirPosicion(Asiento[][] sala, String posicion){

        int[] resultado = new int[2];

        for (int i = 0; i++ < sala.length; ) {

            for (int j = 0; j < sala[i].length; j++) {

                if (sala[i][j].valor.equals(posicion)){

                    resultado[0] = i;
                    resultado[1] = j;

                }

            }

        }

        return resultado;

    }

    public static void imprimirLento(String texto, int velocidadMs) {

        for (int i = 0; i < texto.length(); i++) {

            System.out.print(texto.charAt(i));
            try {
                Thread.sleep(velocidadMs); // Pausa entre caracteres
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(); // Salto de línea al final

    }

    public static void pausa(){

        System.out.println("Presiona Enter para continuar...");
        new java.util.Scanner(System.in).nextLine();

    }

    public static Espectador crearEspectador(Cine sala){

        Scanner teclado = new Scanner(System.in);
        Espectador espectador = new Espectador("",0,0);

        System.out.println("Empleado: Perfecto, ¿A qué nombre es la reserva de entradas?");
        String nombre = teclado.nextLine();


        System.out.println("Empleado: Por políticas del cine tengo que hacerle esta pregunta...");
        System.out.println("Empleado: ¿Qué edad tiene?");
        int edad = teclado.nextInt();

        if (sala.pelicula.edad_minima > edad){

            System.out.println("Empleado: Lo siento " + nombre + ", como he dicho antes, por políticas del cine no puedo dejarte entrar...");
            pausa();
            return null;

        }

        System.out.println("Empleado: Perfecto, la entrada son " + sala.precio_entrada + " ¿Con qué va a pagar?");
        double saldo = teclado.nextDouble();


        if (sala.precio_entrada > saldo){

            System.out.println("Empleado: Lo siento, la entrada es de " + sala.precio_entrada + ", no dispone del dinero suficiente...");
            pausa();
            return null;

        }

        espectador.setNombre(nombre);
        espectador.setEdad(edad);
        espectador.setSaldo(saldo);

        return espectador;

    }

    public static void comprobarSala(Cine[] cine, int opcion, Espectador espectador){

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i <= cine.length ; i++) {

            if ((i+1)==opcion) {

                System.out.println("Empleado: Buenísima película, me encanta " + cine[i].pelicula.director + " como director.");
                pausa();

                cine[i].mostrarSala();
                System.out.println("¿Donde desea sentarse?");
                String idAsiento = teclado.nextLine();

                int[] posicion = traducirPosicion(cine[i].sala, idAsiento);

                sentarEspectador(cine, opcion, espectador, posicion, i);



            }

        }

    }

    public static void sentarEspectador(Cine[] cine, int opcion, Espectador espectador, int[] posicion, int i){

        Scanner teclado = new Scanner(System.in);

        if (cine[i].sala[posicion[0]][posicion[1]].ocupado) { // ¿Asiento ocupado?

            System.out.println("Asiento ocupado. Escoja otro sitio...");
            cine[i].mostrarSala();
            String idAsiento = teclado.nextLine();

            posicion = traducirPosicion(cine[i].sala,idAsiento);

            sentarEspectador(cine, opcion, espectador, posicion, i);

        } else {

            cine[i].ocuparAsiento(cine[i].sala[posicion[0]][posicion[1]], posicion, espectador.cara);
            System.out.println("Empleado: Excelente, hasta luego...");
            pausa();

        }

    }

}
