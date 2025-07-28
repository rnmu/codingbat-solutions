public class EndOther {
    public boolean endOther(String a, String b) {
        String longer;
        String shorter;
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() > b.length()){
            longer = a;
            shorter = b;
        }else{
            shorter = a;
            longer = b;
        }
        int start = longer.length() - shorter.length();
        for ( int i=0 ; i< shorter.length();i++){
            if(longer.charAt(start + i )!= shorter.charAt(i)){
                return false;
            }
        }
        return true;
    }
}