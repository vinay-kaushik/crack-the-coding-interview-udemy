package Recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(findPower(5,3));
    }

    public static int findPower(int x,int n){
        ///Base Case
        if(n==0){
            return 1;
        }

        ///Recursive
        int smallOutput = findPower(x,n-1);

        /// Calculation

        return x*smallOutput;
    }
}
