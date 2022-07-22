package Recursion;

public class countZeroes {
    public static void main(String[] args) {

        System.out.println(countZero(10203));
    }

    public static int countZero(int n){
        if(n==0){
            return 0;
        }
        /// recursive
        int smallAns = countZero(n/10);

        /// calculation
        int last_digit = n%10;

        if(last_digit==0){
            return 1 + smallAns;
        }else{
            return smallAns;
        }
    }
}
