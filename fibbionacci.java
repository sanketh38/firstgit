package __pycache__;

public class fibbionacci {
    static int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        int fib1= fib(n-1);
        int fib2= fib(n-2);
        int result = fib1+fib2;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    
}
