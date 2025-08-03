public class AllSwap {
    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0 ;i <strings.length;i++){
            String key = strings[i].substring(0,1);

            if(map.containsKey(key)){
                int j = map.get(key);
                String swap = strings[i];
                strings[i]  = strings[j];
                strings[j] = swap;
                map.remove(key);
            }else{
                map.put(key,i);
            }
        }
        return strings;
    }
}