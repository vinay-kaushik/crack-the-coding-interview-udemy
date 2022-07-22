import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s[]={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }

    private static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
}
