public class Last2 {
    public int last2(String str) {
        int len = str.length();
        if(len < 2){
            return 0;
        }
        String last = str.substring(len-2);
        int count = 0;
        for(int i = 0 ; i<len-2;i++){
            if(str.substring(i,i+2).equals(last)){
                count +=1;
            }
        }
        return count;
    }
}