public class ConCat {
    public String conCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if(a == "" || b ==""){
            return a + b;
        }
        if(a.charAt(lenA-1) == b.charAt(0) ){
            return a + b.substring(1,lenB) ;
        }
        return a + b;
    }
}