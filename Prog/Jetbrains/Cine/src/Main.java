import java.sql.SQLOutput;

public class Main {
    static void main() {
        //CREAMOS PELICULAS Y LAS METEMOS EN UN ARRAY(MAXIMO 5)
        Pelicula peli1 = new Pelicula("El Rey León", "Roger Allers", 88, 15, 7.0);
        Pelicula peli2 = new Pelicula("El Origen", "Christopher Nolan", 148, 13, 7.0);
        Pelicula peli3 = new Pelicula("Coco", "Adrian Molina", 105, 7, 7.0);
        Pelicula peli4 = new Pelicula("Joker", "Todd Phillips", 122, 16, 7.0);
        Pelicula peli5 = new Pelicula("Interestellar", "Crhistopher Nolan", 169, 12, 7.0);


        Pelicula [] pelis1 = new Pelicula[5];
        pelis1[0] = peli1;
        pelis1[1] = peli2;
        pelis1[2] = peli3;
        pelis1[3] = peli4;
        pelis1[4] = peli5;

        //Para crear un cine necesita saber las peliculas que hay en el
        Cine cine = new Cine();
        cine.aniadirPeli(peli1);
        cine.aniadirPeli(peli2);
        cine.aniadirPeli(peli3);
        cine.aniadirPeli(peli4);
        cine.aniadirPeli(peli5);


        //Cada sala necesita una pelicula para reproducir
        Sala[] salas = new Sala[5];
        for (int i = 0; i < salas.length; i++) {
            Sala sala = new Sala(pelis1[i]);
            salas[i] = sala;
        }

        final String AZUL = "\u001B[34m";
        final String RESET = "\u001B[0m";


        for (int i = 0; i < salas.length; i++) {
            System.out.println(AZUL + "-------------------------SALA " + (i +1) + "--------------------------" + RESET);
            salas[i].mostrarSala();

            //Creo espectadores y los meto en un array
            Espectador [] espectadores1 = new Espectador[30];
            int j = 0;
            for (Nombres nombre: Nombres.values()) {
                int edad = (int) ((Math.random() * (101)));
                int dinero = (int) ((Math.random() * 100));

                Espectador esp1 = new Espectador(nombre.toString(), edad, dinero);
                espectadores1[j] = esp1;
                j++;
            }

            //Le doy la lista de espectadores y los esparce segun los criterios por la sala
            salas[i].spreadEspectadores(espectadores1);
            System.out.println();
            System.out.println();
            System.out.println(AZUL + "------------------SALA CON ESPECTADORES------------------" + RESET);

            salas[i].mostrarSala();
        }
    }
}
