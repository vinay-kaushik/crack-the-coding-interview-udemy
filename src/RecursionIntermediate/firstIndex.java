package RecursionIntermediate;

public class firstIndex {

    public static void main(String[] args) {

        int a[] = {1,4,3,4,4};
        System.out.println(getFirstIndex(a,5,3,0));

    }

    public static int getFirstIndex(int a[],int n,int x,int i){
        if(i==n){
            return -1;
        }
        if(a[i]==x){
            return i;
        }
        return getFirstIndex(a,n,x,i+1);
    }

}
