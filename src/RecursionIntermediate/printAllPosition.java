package RecursionIntermediate;

public class printAllPosition {
    public static void main(String[] args) {
        int a[] = {5,5,6,5,6,7};
        printPosition(a,6,6,0);

    }

    static void printPosition(int a[],int n,int x,int i){
        if(i==n){
            return;
        }
        if(a[i]==x){
            System.out.println(i);;
        }
        printPosition(a,n,x,i+1);
    }
}
