public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int [] result= new int[2] ;
        int len = nums.length/2;
        result[0] = nums[len-1];
        result[1] = nums[len];
        return result;
    }
}