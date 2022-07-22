package Recursion;

public class multiply {
    public static void main(String[] args) {
        System.out.println(mul(3,6));
    }

    public static int mul(int m,int n){
        if(n==0){
            return 0;
        }
        /// recursive
        int smallAns = mul(m,n-1);  /// m*(n-1)

        /// calculation
        return smallAns + m;
    }
}
