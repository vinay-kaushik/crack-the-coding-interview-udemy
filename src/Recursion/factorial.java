package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if(n < 0) return -1;
        if(n==0) return 1;

        int smallAns = fact(n-1);
        return n*smallAns;
    }
}
