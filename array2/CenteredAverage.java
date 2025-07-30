public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int sum = 0;
        int min =  nums[0];
        int max = nums[0];
        for(int i = 0 ;i <nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            sum += nums[i];
        }
        int average = (sum - max - min)/(nums.length-2);
        return average;
    }
}