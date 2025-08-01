public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for(int i = 0 ; i< words.length; i++){
            if(!words[i].equals(target)){
                count ++;
            }
        }
        String [] result = new String [count];
        int j = 0;
        for(int i = 0 ; i<words.length;i++){
            if(!words[i].equals(target)){
                result[j]= words[i];
                j++;
            }
        }
        return result;
    }
}