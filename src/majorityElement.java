public class majorityElement {

    public static void main(String[] args) {
        int[] nums={3,2,3};
        System.out.println(majorityElement3(nums));

    }

    public static int majorityElement3(int[] nums) {
        int count=0, ret = 0;
        for (int num: nums) {
            if (count==0)
                ret = num;
            if (num!=ret)
                count--;
            else
                count++;
        }
        return ret;
    }
}
