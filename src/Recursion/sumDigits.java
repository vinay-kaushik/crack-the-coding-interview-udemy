package Recursion;

public class sumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }

    public static int sumDigits(int n){
        if(n==0){
            return 0;
        }

        /// recursive
        int smallAns = sumDigits(n/10);

        /// calculation
        int last_digit = n%10;
        return smallAns + last_digit;
    }
}
