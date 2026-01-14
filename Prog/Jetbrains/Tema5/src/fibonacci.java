public class fibonacci {
    public static void main(String[] args) {
        int n = 50;
        System.out.println("Fibonacci f(" + n + ") es " + secuencia(n));
    }

    public static long secuencia(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return secuencia(n-1)+secuencia(n-2);
    }
}
