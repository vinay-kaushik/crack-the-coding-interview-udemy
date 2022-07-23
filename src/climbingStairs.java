import java.util.HashMap;
import java.util.Map;

public class climbingStairs {

    public static void main(String[] args) {
        int n=2;
        System.out.println(climbStairsRecursive(n));
        System.out.println(climbStairsMemoization(n));
        System.out.println(climbStairsDP(n));
    }

    public static int climbStairsRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }
    public static int climbStairsMemoization(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 1);
        memo.put(2, 2);
        return climbStairs(n, memo);
    }

    private static int climbStairs(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
        return memo.get(n);
    }
    public static int climbStairsDP(int n) {
        if (n <= 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int newValue = prev1 + prev2;
            prev1 = prev2;
            prev2 = newValue;
        }

        return prev2;
    }

}
