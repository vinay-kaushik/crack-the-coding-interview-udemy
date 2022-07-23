public class singleNumber {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        System.out.println(getSingleNumber(nums));
    }

    public static int getSingleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}
