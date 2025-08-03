public class Pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 0 ;i <strings.length;i++){
            String word = strings[i];
            String key = word.substring(0,1);
            String value = word.substring(word.length()-1);
            map.put(key,value);
        }
        return map;
    }
}