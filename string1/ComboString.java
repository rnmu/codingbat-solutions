public class ComboString {
    public String comboString(String a, String b) {
        String shortS = "";
        String longS = "";
        if(a.length() > b.length()){
            longS = a;
            shortS = b;
        }else{
            longS = b;
            shortS = a;
        }
        return shortS + longS + shortS;
    }
}