public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        if(nums.length <=1){
            return nums;
        }
        int [] result = new int[nums.length];
        for(int i = 0 ;i < nums.length-1 ;i++){
            if(i== 0){
                result[nums.length-1] = nums[0];
            }
            result[i] = nums[i+1];
        }
        return  result;
    }
}