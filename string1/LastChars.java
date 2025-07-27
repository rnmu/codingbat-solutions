public class LastChars {
    public String lastChars(String a, String b) {
        int len = b.length();
        String missingchar = "@";
        String result = "";
        if(a == "" && b ==""){
            result = missingchar + missingchar;
        }else if (a == ""){
            result = missingchar + b.charAt(len-1) ;
        }else if(b == ""){
            result = a.charAt(0) + missingchar;
        }else{
            result = result + a.charAt(0)+  b.charAt(len-1);
        }
        return result;
    }
}