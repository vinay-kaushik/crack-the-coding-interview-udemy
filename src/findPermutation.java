public class findPermutation {
    public static void main(String[] args) {
        String  s = "I";
        int[] x=findnextPermutation(s);
        for(int i:x){
            System.out.println(i);
        }
    }

    public static int[] findnextPermutation(String s) {
        int n = s.length(), arr[] = new int[n + 1];
        for (int i = 0; i <= n; i++) arr[i] = i + 1; // sorted
        for (int h = 0; h < n; h++) {
            if (s.charAt(h) == 'D') {
                int l = h;
                while (h < n && s.charAt(h) == 'D') h++;
                reverse(arr, l, h);
            }
        }
        return arr;
    }

    static void reverse(int[] arr, int l, int h) {
        while (l < h) {
            arr[l] ^= arr[h];
            arr[h] ^= arr[l];
            arr[l] ^= arr[h];
            l++; h--;
        }
    }
}
