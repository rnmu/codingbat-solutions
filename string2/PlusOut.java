public class PlusOut {
    public String plusOut(String str, String word) {
        String result = "" ;
        int len = word.length();
        int max = str.length()-len;
        for(int i = 0 ;i<str.length();i++){
            if( i <= max &&  str.substring(i,i+len).equals(word)){
                result += word;
                i+= len-1;
            }else{
                result += "+";
            }
        }
        return result;
    }
}