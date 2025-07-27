public class StartWord {
    public String startWord(String str, String word) {
        int lenW = word.length();
        if(str.length() < lenW){
            return "";
        }
        if(str.startsWith(word)){
            return word;
        }else if(str.substring(1,lenW).equals(word.substring(1))){
            return str.charAt(0) + word.substring(1);
        }
        return "";
    }
}