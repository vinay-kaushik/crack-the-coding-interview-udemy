public class countOccurenceOfElement {
    public static void main(String[] args) {
        int a[] = {5,5,6,5,6,7};

        System.out.println(count(a,6,7,0));
    }

    static void printAllPos(int a[],int n,int x,int i){
        if(i==n){
            return;
        }
        if(a[i]==x){
            System.out.println(i);
        }
        printAllPos(a,n,x,i+1);
    }

    static int count(int a[],int n,int x,int i){
        if(i==n){
            return 0;
        }
        if(a[i]==x){
            return 1 + count(a,n,x,i+1);
        }else {
            return  count(a,n,x,i+1);
        }
    }
}
