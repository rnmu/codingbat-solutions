public class StringMatch {
    public int stringMatch(String a, String b) {
        int count=0;
        int shorter = Math.min(a.length(),b.length());
        for (int i = 0 ; i< shorter-1; i++){
            if(a.substring(i,i+2).equals(b.substring(i,i+2))){
                count+=1;
            }
        }
        return count;
    }
}