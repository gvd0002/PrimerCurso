public class prueba {
    public static void main() {
        int[] array1 = {3,8,4,1,6,3,2,7,8,1,12,3,6,8,3,125,754,23,76,423};

        burbujaA(array1);
        System.out.println("Método burbuja menor a mayor:");

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();


        int[] array2 = {3,8,4,1,6,3,2,7,8,1,12,3,6,8,3,125,754,23,76,423};

        burbujaB(array2);
        System.out.println("Método burbuja mayor a menor:");

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();



        int[] array3 = {3,8,4,1,6,3,2,7,8,1,12,3,6,8,3,125,754,23,76,423};

        insercionA(array3);
        System.out.println("Método insercion menor a mayor:");

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

        System.out.println();


        int[] array4 = {3,8,4,1,6,3,2,7,8,1,12,3,6,8,3,125,754,23,76,423};

        insercionB(array4);
        System.out.println("Método insercion mayor a menor:");

        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }

        System.out.println();

        int[] array5 = {3,8,4,1,6,3,2,7,8,1,12,3,6,8,3,125,754,23,76,423};

        seleccionA(array5);
        System.out.println("Método seleccion menor a mayor:");
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i] + " ");
        }

    }

    public static void seleccionA(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minimo = array[i];
            int pos = i;
            for (int j = i; j < array.length-1; j++) {
                if(array[j+1] < minimo){
                    minimo = array[j+1];
                    pos = j+1;
                }
            }
            int aux = array[i];
            array[i] = minimo;
            array[pos] = aux;
        }
    }

    public static void insercionA(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for(int j = i; j >= 0 && array[j] > array[j+1]; j--){
                int aux = array[j];
                array[j] = array[j+1];
                array[j+1] = aux;
            }
        }
    }

    public static void insercionB(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for(int j = i; j >= 0 && array[j] < array[j+1]; j--){
                int aux = array[j];
                array[j] = array[j+1];
                array[j+1] = aux;
            }
        }
    }

    public static void burbujaA(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++) {
                if (array[i] > array[j]){
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static void burbujaB(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++) {
                if (array[i] < array[j]){
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }


}
