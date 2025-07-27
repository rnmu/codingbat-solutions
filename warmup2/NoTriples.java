public class NoTriples {
    public boolean noTriples(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len -2 ;i++){
            int value = nums[i];
            if(nums[i+1] == value && nums[i+2] == value){
                return false;
            }
        }
        return true;
    }
}