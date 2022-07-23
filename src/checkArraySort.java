public class checkArraySort {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        System.out.println(isSorted(arr,arr.length));
    }

    static boolean isSorted(int a[],int n){
        if(n==0 || n==1){
            return true;
        }
        if(a[n-2] > a[n-1]){
            return false;
        }
        return isSorted(a,n-1);
    }

}
