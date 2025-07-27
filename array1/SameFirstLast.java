public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return false;
        }
        if(nums[0] == nums[len-1] && len >= 1){
            return true;
        }else{
            return false;
        }
    }
}