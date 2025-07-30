public class Pre4 {
    public int[] pre4(int[] nums) {
        int indexOf4 = 0;
        int i = 0;
        while(i<nums.length){
            if(nums[i] ==4){
                indexOf4 = i;
                break;
            }
            i++;
        }
        int[] result = new int[indexOf4];
        for(int j = 0 ;j<indexOf4;j++){
            result[j] = nums[j];
        }
        return result;
    }
}