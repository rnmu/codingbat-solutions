public class ZipZap {
    public String zipZap(String str) {
        String result = "";
        int len = str.length();
        for(int i = 0 ; i< len;i++){
            if(i <= len-3 && str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
                result += "zp";
                i+=2 ;
            }else{
                result +=  str.charAt(i);
            }
        }
        return result;
    }
}