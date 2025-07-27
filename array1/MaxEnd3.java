public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int max = 0;
        if(nums[0] > nums[2]){
            max = nums[0];
        }else{
            max = nums[2];
        }
        int[] maxEnd3 = {max,max,max};
        return maxEnd3;
    }
}