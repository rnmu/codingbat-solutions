public class MidThree {
    public int[] midThree(int[] nums) {
        int [] result= new int[3] ;
        int len = nums.length/2;
        result[0] = nums[len-1];
        result[1] = nums[len];
        result[2] = nums[len+1];
        return result;
    }
}