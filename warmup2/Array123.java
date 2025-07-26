public class Array123 {
    public boolean array123(int[] nums) {
        int count1 = 0 ;
        int count2 = 0;
        int count3= 0;
        for(int i = 0 ; i< nums.length;i++){
            if( nums[i] == 1){
                count1 ++;
            }
            if( nums[i] == 2){
                count2 ++;
            }
            if( nums[i] == 3){
                count3 ++;
            }
        }
        if(count1 > 0 && count2> 0 && count3>0){
            return true;
        }
        return false;
    }
}