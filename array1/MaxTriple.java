public class MaxTriple {
    public int maxTriple(int[] nums) {
        int max = nums[0];
        int len= nums.length;
        if(nums[len/2] > max ){ // len/2 middle index
            max = nums[len/2];
        }
        if(nums[len-1] > max){ // len-1 last index
            max = nums[len-1];
        }
        return max;
    }
}