public class firstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 0 ;i <strings.length;i++){
            String result = strings[i].substring(0,1);
            if(map.containsKey(result)){
                map.put(result,map.get(result) + strings[i]);
            }else{
                map.put(result,strings[i]);
            }
        }
        return map;
    }
}