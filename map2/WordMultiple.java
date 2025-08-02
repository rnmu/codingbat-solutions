public class WordMultiple {
    Map<String, Boolean> map = new HashMap<String, Boolean>();
        for(int i = 0 ;i <strings.length;i++){
        String word = strings[i];
        if(map.containsKey(word)){
            map.put(word,true);
        }else{
            map.put(word,false);
        }
    }
        return map;
}