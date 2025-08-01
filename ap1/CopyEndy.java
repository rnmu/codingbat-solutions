public class CopyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int[] result  = new int[count];
        int j = 0;
        for(int i = 0 ; i < nums.length ;i++){
            if(isEndy(nums[i])){
                result[j] = nums[i];
                j++;
            }
            if(j == count){
                break;
            }
        }
        return result;
    }

    public boolean isEndy(int n){
        if ((n >= 0 && n <= 10) || (n>= 90 && n<= 100)){
            return true;
        }
        return false;
    }
}