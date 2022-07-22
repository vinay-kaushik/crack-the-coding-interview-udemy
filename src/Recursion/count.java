package Recursion;

public class count {
    public static void main(String[] args) {
        System.out.println(count(7320));
    }

    public static int count(int n){
        if(n==0){
            return 0;
        }
        /// recursive
        int smallAns = count(n/10);

        /// calculation
        return smallAns + 1;

    }
}
