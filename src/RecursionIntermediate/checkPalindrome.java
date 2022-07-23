package RecursionIntermediate;

public class checkPalindrome {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,3,2,1};
        System.out.println(check(a,0,6));
    }

    static boolean check(int a[],int s,int e){
        if(s > e){
            return true;
        }
        if(a[s] == a[e]){
            return check(a,s+1,e-1);
        }else{
            return false;
        }
    }
}
