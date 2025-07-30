public class Post4 {
    public int[] post4(int[] nums) {
        int indexOf4 = 0;
        int i = 0;
        // last index of 4
        while(i<nums.length){
            if(nums[i] ==4){
                indexOf4 = i;
            }
            i++;
        }
        int size = nums.length -1-indexOf4; //the size of the array post4
        int[] result = new int[size];
        for(int j = 0 ;j<size;j++){
            result[j] = nums[j+indexOf4+1];
        }
        return result;
    }
}