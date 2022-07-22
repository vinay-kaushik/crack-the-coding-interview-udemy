package Recursion;

public class geometricSum {

    public static void main(String[] args) {

        System.out.println(gSum(3));

    }

    public static double gSum(int k){
        /// base
        if(k==0){
            return 1;
        }
        /// recursive
        double smallAns = gSum(k-1);

        /// calculation
        return smallAns + 1.0/Math.pow(2,k);
    }
}
