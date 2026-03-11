public class EjemploExcepcion {
    static void main() {

        try{
            int valor = 5;
            valor/=0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
