public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        int [] result = new int[nums.length];
        int front = 0;
        for(int i =0; i < nums.length;i++){
            if(nums[i] != 10){
                result[front]= nums[i];
                front++;
            }
        }
        return result;
    }
}