package Recursion;

public class printReverse {
    public static void main(String[] args) {
        
        print1(5);
        System.out.println();
        print2(5);
    }

    private static void print2(int n) {

        if(n==0){
            return;    /// mandatory
        }

        System.out.print(n+" ");

        /// Recursive case
        print2(n-1);     ///  1 2 3 4 ......n-1



        return;    /// optional
    }

    private static void print1(int n) {
        if(n==0){
            return;    /// mandatory
        }

        /// Recursive case
        print1(n-1);     ///  1 2 3 4 ......n-1


        System.out.print(n+" ");
        return;    /// optional
        
    }
}
