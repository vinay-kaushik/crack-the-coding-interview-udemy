//package RecursionIntermediate;
//
//
//public class checkArraySort {
//    public static void main(String[] args) {
//
//
//    }
//
//    public static boolean isSorted(int a[], int n){
//        if(n==0 || n==1){
//            return true;
//        }
//
//        if(a[0] > a[1]){
//            return false;
//        }
//
//        return isSorted(a+1 , n-1);;
//
//    }
//
//    public static boolean isSorted2(int a[],int n){
//        if(n==0 || n==1){
//            return true;
//        }
//        boolean isSmallerSorted = isSorted(a+1 , n-1);
//        if(!isSmallerSorted){
//            return false;
//        }
//        if(a[0] > a[1]){
//            return false;
//        }else{
//            return true;
//        }
//    }
//
//    public static boolean isSorted3(int a[],int n){
//        if(n==0 || n==1){
//            return true;
//        }
//        if(a[n-2] > a[n-1]){
//            return false;
//        }
//        return isSorted3(a,n-1);
//    }
//}
