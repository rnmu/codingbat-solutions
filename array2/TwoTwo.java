public class TwoTwo {
    public boolean twoTwo(int[] nums) {
        int len = nums.length;
        for(int i = 0 ;i <len ;i++){
            if(nums[i] == 2){
                if((i == 0 || nums[i-1] != 2 ) && ( i == len -1 || nums[i+1] != 2)){
                    return false;
                }
            }
        }
        return true;
    }
}