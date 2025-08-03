public class maxMirror {
    public int maxMirror(int[] nums) {
        int max = 0;
        int len = nums.length;
        for(int i=0 ; i <len ;i++){
            for(int j =len -1 ;j>=0 ;j--){
                int count =0;
                int a = i;
                int b = j;
                while(a<len && b>=0 && nums[a] == nums[b]){
                    count++;
                    a++;
                    b--;
                }
                if(count >max){
                    max =count;
                }
            }
        }
        return max;
    }
}