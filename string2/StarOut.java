public class StarOut {
    public String starOut(String str) {
        String result = "";
        int len = str.length();
        for(int i = 0 ;i<len ;i++){
            if(i>0 && str.charAt(i-1) =='*' ||str.charAt(i) =='*'){
                continue;
            }
            if(i < len-1  && str.charAt(i+1) =='*'){
                continue;
            }else{
                result += str.charAt(i);
            }
        }
        return result;
    }
}