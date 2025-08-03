public class CountClumps {
    public int countClumps(int[] nums) {
        int count =0;
        boolean found  = false;
        for(int i = 0 ;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                if(!found){
                    count ++;
                    found = true;
                }
            }else{
                found = false;
            }
        }
        return count ;
    }
}