public interface Calculadora {

    int calcular(int a, int b);
}

abstract class Calculadora2{
    abstract int calcular2(int a, int b);
}

class Main{
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora() {
            @Override
            public int calcular(int a, int b) {
                return a+b;
            }
        };

        Calculadora2 calc = new Calculadora2() {
            @Override
            int calcular2(int a, int b) {
                return 0;
            }
        };

        System.out.println(calculadora.calcular(5,3));
    }
}