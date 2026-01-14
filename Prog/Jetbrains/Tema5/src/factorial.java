
public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(funcionFactorial(n));
    }

    public static int funcionFactorial (int n){
        if(n == 1)
            return 1;
        else{
            return n*funcionFactorial(n-1);
        }
    }
}
