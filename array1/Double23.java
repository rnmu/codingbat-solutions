public class Double23 {
    public boolean double23(int[] nums) {
        int len = nums.length;
        if(len>1 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3))){
            return true;
        }
        return false;
    }
}