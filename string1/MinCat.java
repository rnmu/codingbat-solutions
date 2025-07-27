public class MinCat {
    public String minCat(String a, String b) {
        int lenA = a.length() ;
        int lenB = b.length();
        if( lenA < lenB){
            return a + b.substring(lenB-lenA) ;
        }else if( lenA > lenB){
            return a.substring(lenA-lenB) + b ;
        }else{
            return a + b;
        }
    }
}