import java.util.ArrayDeque;
import java.util.Deque;

public class removeAdjacentDuplicates2 {
    public static void main(String[] args) {
        String s="deeedbbcccbdaa";
        int k=3;
        System.out.println(removeDuplicates(s,k));

    }

    public static String removeDuplicates(String s, int k) {
        Deque<char[]> stk = new ArrayDeque<>();
        for (char c : s.toCharArray())
            if (stk.isEmpty() || c != stk.peek()[0])
                stk.push(new char[]{c, 1}); // here 1 is an int literal initializing char type variable.
            else if (++stk.peek()[1] == k)
                stk.pop();
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            while (stk.peekLast()[1]-- > 0)
                sb.append(stk.peekLast()[0]);
            stk.pollLast();
        }
        return sb.toString();
    }
}
