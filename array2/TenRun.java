public class TenRun {
    public int[] tenRun(int[] nums) {
        int [] result = new int [nums.length];
        int count = 0;
        int multiple10 = 0;
        for(int i =0 ;i<nums.length;i++){
            if(nums[i] %10 == 0 ){
                count = 1;
                multiple10 =nums[i];
                result[i] = multiple10;
            }else if(count == 1 && nums[i] %10 == 0){
                count = 0;
                result[i] = multiple10;
                count = 0;
            }
            if(count == 1){
                result[i] = multiple10;
            }else{
                result[i] = nums[i];
            }
        }
        return result;
    }
}