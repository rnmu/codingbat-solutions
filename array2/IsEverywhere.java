public class IsEverywhere {
    public boolean isEverywhere(int[] nums, int val) {
        for(int i = 0 ;i<nums.length-1 ; i++){
            if(nums[i]!= val && nums[i+1] != val){ // checking paris [1,2],[1,3]
                return false;
            }
        }
        return true;
    }
}