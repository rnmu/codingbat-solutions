public class WithoutX {
    public String withoutX(String str) {
        int len = str.length();
        if(len >1 && str.startsWith("x") && str.endsWith("x")){
            return str.substring(1,len-1);
        }else if(str.startsWith("x") ){
            return str.substring(1,len);
        }else if(str.endsWith("x")){
            return str.substring(0,len-1);
        }else{
            return str;
        }
    }
}