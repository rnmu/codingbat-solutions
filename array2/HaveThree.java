public class HaveThree {
    public boolean haveThree(int[] nums) {
        int count3 = 0;
        for(int i = 0 ;i <nums.length ;i++){
            if(nums[i] == 3){
                if(i > 0 && nums[i-1] == 3){
                    return false;
                }
                count3++;
            }
        }
        if(count3 == 3){
            return true;
        }
        return false;
    }
}