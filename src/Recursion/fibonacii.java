package Recursion;



public class fibonacii {
    public static void main(String[] args) {
        int n =6;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        /// Recursive case
        int smallOutput1 = fib(n-1);
        int smallOutput2 = fib(n-2);

        /// calculation
        return smallOutput1 + smallOutput2;
    }
}
