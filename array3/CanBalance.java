public class CanBalance {
    public boolean canBalance(int[] nums) {
        for(int i = 0; i<nums.length;i++){
            int front = 0;
            int back = 0;

            for(int j =0 ;j<i ;j++){
                front+= nums[j];
            }
            for(int j = i ; j< nums.length ;j++){
                back+= nums[j];
            }
            if(front == back){
                return true;
            }
        }
        return false;
    }
}