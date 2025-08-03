public class MirrorEnds {
    public String mirrorEnds(String string) {
        int len =string.length();
        String result ="";
        for(int i = 0;i<len;i++){
            if(string.charAt(i) == string.charAt(len -i -1)){
                result += string.charAt(i);
            }else{
                break;
            }
        }
        return result;
    }
}