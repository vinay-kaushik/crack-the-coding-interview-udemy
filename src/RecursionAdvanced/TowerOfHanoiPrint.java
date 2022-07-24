package RecursionAdvanced;

public class TowerOfHanoiPrint {
    public static void main(String[] args) {

        int n=5;
        System.out.println(toh(n));

        printSteps(n,'A','C','B');
    }

    static int toh(int n){
        if(n==0){
            return 0;
        }
        return toh(n-1) + 1 + toh(n-1);
    }

    static void printSteps(int n, char s, char d, char h){
        if(n==0){
            return;
        }
        printSteps(n-1,s,h,d);
        System.out.println("Moving disk "+n+" from "+s+" to "+d);
//        cout<<"Moving disk "<<n<<" from "<<s<<" to "<<d<<endl;
        printSteps(n-1,h,d,s);
    }
}
