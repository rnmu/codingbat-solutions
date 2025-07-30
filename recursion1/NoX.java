public class NoX {
    public String noX(String str) {
        if(str.length() <1 ){
            return "";
        }
        if(str.charAt(0) == 'x'){
            return noX(str.substring(1));
        }
        return str.substring(0,1) + noX(str.substring(1));
    }
}