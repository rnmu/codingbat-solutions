public class Has271 {
    public boolean has271(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len-2 ;i++){
            int value = nums[i];

            if( nums[i+1] == (value+5) && Math.abs(nums[i+2] -(value-1)) <=2){
                return true;
            }
        }
        return false;
    }
}