public class Celula {

    Celula(){

    }

    public static boolean comprobarSupervivencia(boolean [][] generacionActual, int x, int y){
        boolean sobrevive = true;
        int contador = 0;

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {

                if(i == 0 && j == 0) continue;
                else {
                    int nx = x + i;
                    int ny = y + j;

                    if(nx >= 0 && nx < generacionActual.length &&
                       ny >= 0 && ny < generacionActual.length){
                        if(generacionActual[nx][ny]) contador++;
                    }
                }
            }
        }

        if(contador == 2 || contador == 3) sobrevive = true;
        else sobrevive = false;

        return sobrevive;
    }

    public static boolean comprobarNacimiento(boolean[][] generacionActual, int x, int y){
        boolean nace = true;
        int contador = 0;

        if(!generacionActual[x][y]) {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {

                    if(i == 0 && j == 0) continue;
                    else {
                        int nx = x + i;
                        int ny = y + j;

                        if(nx >= 0 && nx < generacionActual.length &&
                                ny >= 0 && ny < generacionActual.length){
                            if(generacionActual[nx][ny]) contador++;
                        }
                    }
                }
            }
        }

        if(contador == 3) nace = true;
        else nace = false;

        return nace;
    }
}
