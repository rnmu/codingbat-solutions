public class AtFirst {
    public String atFirst(String str) {
        if(str == ""){
            return "@" + "@";
        }else if(str.length() < 2){
            return str.charAt(0) + "@";
        }else{
            return str.substring(0,2);
        }
    }
}