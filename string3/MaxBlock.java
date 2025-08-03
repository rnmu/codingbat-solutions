public class MaxBlock {
    public int maxBlock(String str) {
        if(str.length() == 0){
            return 0;
        }
        int count = 1;
        int max = 1;
        for(int i = 0; i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
                if(count > max){
                    max = count;
                }
            }else{
                count = 1;
            }
        }
        return max;
    }
}