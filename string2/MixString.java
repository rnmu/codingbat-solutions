public class MixString {
    public String mixString(String a, String b) {
        String result = "";
        for(int i=0 ; i < Math.max(a.length(),b.length());i++){
            if(i < a.length()){
                result += a.charAt(i);
            }
            if(i < b.length()){
                result += b.charAt(i);
            }
        }
        return result;
    }
}