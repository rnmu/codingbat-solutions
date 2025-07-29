public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean skip = false;
        for(int i =0 ;i<nums.length;i++){
            if(nums[i] == 6 ){
                skip = true;
            }else if(skip && nums[i] == 7 ){
                skip = false;
            }else if(!skip){
                sum+= nums[i];
            }
        }
        return sum;
    }
}