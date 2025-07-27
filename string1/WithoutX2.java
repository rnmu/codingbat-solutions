public class WithoutX2 {
    public String withoutX2(String str) {
        int len = str.length();
        // starts with "xx"
        if(len >1 && str.startsWith("xx")){
            return str.substring(2);
            // starts with "x"
        }else if(str.startsWith("x")){
            return str.substring(1);

            // second character is "x"
        }else if(len >1 && str.charAt(1) == 'x'){
            return str.charAt(0) + str.substring(2);
        }else{
            return str;
        }
    }
}