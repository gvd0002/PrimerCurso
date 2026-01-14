public class matriz {
    public static void main() {
        int [][] matriz = new int [3][3];
        int [][] matriz2 ={{35,27,93},{10,63,53},{86,24,74}};
        int contador = 1;

        /*for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = contador;
                contador++;
            }
        }

        System.out.println("Matríz 1: ");
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matríz 2: ");
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.println("Matríz 2 sin ordenar: ");
        for(int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        ordenarMatriz(matriz2);
        System.out.println("Matríz 2 ordenada: ");
        for(int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ordenarMatriz(int[][] matriz){
        int[] array = new int [matriz.length*matriz[0].length];

        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++){
                array[contador] = matriz[i][j];
                contador++;
            }
        }

        for (int i = 0; i < array.length-1; i++) {
            for(int j = i; j >= 0 && array[j] > array[j+1]; j--){
                int aux = array[j];
                array[j] = array[j+1];
                array[j+1] = aux;
            }
        }

        contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = array[contador];
                contador++;
            }
        }
    }
}
