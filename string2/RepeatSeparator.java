public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for(int i = 0; i < count ; i++){
            result += word;
            if(i+1 < count){
                result += sep;
            }
        }
        return result;
    }
}