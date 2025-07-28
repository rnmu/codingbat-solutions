public class SwapEnds {
    public int[] swapEnds(int[] nums) {
        int len= nums.length;
        int first = nums[0];
        int last = nums[len-1];
        nums[0] = last;
        nums[len-1] = first;
        return nums;
    }
}