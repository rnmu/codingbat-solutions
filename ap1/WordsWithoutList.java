public class WordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0 ; i< words.length;i++){
            if(words[i].length() != len){
                result.add(words[i]);
            }
        }
        return result;
    }
}