import java.util.Scanner;

public class LengthLastWord {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(findLengthLastWord(s));
    }

    public static int findLengthLastWord(String s) {

        int p = s.length() - 1;
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }

        // compute the length of last word
        int length = 0;
        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
            length++;
        }
        return length;
    }


}
