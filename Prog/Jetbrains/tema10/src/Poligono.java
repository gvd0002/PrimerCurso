public class Poligono {
    int numLados;
    int longitud;

    Poligono(int numLados, int longitud){
        this.numLados = numLados;
        this.longitud = longitud;
    }

    void dibujarPoligono(){
        System.out.println("no se puede dibujar");
    }

     int buscarMayorLado(int [] array){
        int mayor = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] < array[i+1]){
                mayor = i+1;
            }
        }
        return mayor;
    }

}

class Triangulo extends Poligono {

    Triangulo(int longitud){
        super(3, longitud);
    }

    @Override
    void dibujarPoligono(){
        int espacio = 1;
        int columnas = this.longitud+this.longitud-1;
        int filas = this.longitud;
        int medio = columnas/2;

        String [][] matriz = new String[filas][columnas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(i == 0){ //si es la primera fila pongo solo en el medio
                    if(j == medio)
                        matriz[i][j] = "*";
                    else matriz[i][j] = " ";
                }
                else{
                    if(i == filas-1){ //si es la ultima fila pongo intercalados
                        if(j%2==0)
                            matriz[i][j] = "*";
                        else
                            matriz[i][j]= " ";
                    }
                    else { //si son filas intermedias
                        if(j==(medio-(espacio/2)) || j ==(medio+(espacio/2)))
                            matriz[i][j] = "*";
                        else
                            matriz[i][j] = " ";
                    }
                }
            }
            espacio+=2;
        }
        System.out.println("Triangulo normal");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Triangulo invertido");
        for (int i = filas-1; i > -1; i--) {
            for (int j = columnas-1; j > -1; j--) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Triangulo a izquierda");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println();
        }

        System.out.println("Triangulo a derecha");
        for (int i = columnas -1; i > -1; i--) {
            for (int j = filas -1; j > -1; j--) {
                System.out.print(matriz[j][i]);
            }
            System.out.println();
        }
    }
}

class Cuadrado extends Poligono {


    Cuadrado(int longitud){
        super(4, longitud);
    }

    @Override
    void dibujarPoligono(){
        int fila = this.longitud+this.longitud-1;
        int columna = this.longitud+this.longitud-1;

        String [][] matriz = new String[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {

                if((i==0 && j%2==0) || (i==fila-1 && j%2==0) || (j==0 || j==columna-1)){
                    matriz[i][j] = "*  ";
                }
                else {
                    matriz[i][j]="   ";
                }
                if(i%2==1){
                    matriz[i][j]="\t";
                }
            }
        }
        System.out.println();
        System.out.println("Cuadrado: ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
}
