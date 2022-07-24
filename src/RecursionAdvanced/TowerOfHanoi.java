package RecursionAdvanced;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(toh(5));
    }

    static int toh(int n) {
        if (n == 0) {
            return 0;
        }
        return toh(n - 1) + 1 + toh(n - 1);
    }
}
