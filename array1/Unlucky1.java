public class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        int len = nums.length;
        // if the first or last two elements  is 1 and 3
        if(len >1 && (nums[0] == 1 && nums[1] ==3 || nums[len-2] == 1 && nums[len-1] ==3 )){
            return true;
        }else if(len >2 && nums[1] == 1 && nums[2] ==3){
            return true;
        }else{
            return false;
        }
    }
}