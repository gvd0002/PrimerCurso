public class sumatoria {
    public static void main(String[] args) {
        int n = 50;
        System.out.println("Sumatoria de " + n + " es " + sumatoria(n));
    }

    public static int sumatoria(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n+sumatoria(n-1);
        }
    }
}
