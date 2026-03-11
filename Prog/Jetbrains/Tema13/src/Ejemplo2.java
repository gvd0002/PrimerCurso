public class Ejemplo2 {
    static void main() {
        int[] numero = {1,2,3};
        try{
            System.out.println(numero[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
