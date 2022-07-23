import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {
    public static void main(String[] args) {
        int n=3;
        System.out.println(getfizzBuzz(n));
    }

    public static List<String> getfizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
