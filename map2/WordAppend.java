public class WordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String result ="";
        for(int i = 0 ;i <strings.length;i++){
            String word = strings[i];
            if(!map.containsKey(word)){
                map.put(word,1);
            }else{
                int count = map.get(word) + 1;
                map.put(word,count);
                if(count %2 ==0){
                    result += word;
                }
            }
        }
        return result;
    }
}