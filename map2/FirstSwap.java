public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for(int i = 0 ;i <strings.length;i++){
            String key = strings[i].substring(0,1);

            if(map.containsKey(key)){
                int j = map.get(key);
                if( j != -1){
                    String swap = strings[i];
                    strings[i]  = strings[j];
                    strings[j] = swap;
                    map.put(key,-1);
                }
            }else{
                map.put(key,i);
            }
        }
        return strings;
    }
}