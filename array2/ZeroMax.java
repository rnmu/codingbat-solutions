public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        int maxOdd = 0;
        for(int i = nums.length -1 ;i >=0 ;i--){
            if(nums[i] %2 == 1 && nums[i]>maxOdd){
                maxOdd = nums[i];
            }
            if(nums[i] == 0 && maxOdd !=0){
                nums[i] = maxOdd;
            }
        }
        return  nums;
    }
}