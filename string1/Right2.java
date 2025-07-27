public class Right2 {
    public String right2(String str) {
        int len = str.length();
        if(len >2){
            return str.substring(len-2,len)+ str.substring(0,len-2);
        }else{
            return str;
        }
    }
}