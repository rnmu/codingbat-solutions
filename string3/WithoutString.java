public class WithoutString {
    public String withoutString(String base, String remove) {
        String result = "";
        int len = remove.length();
        String lbase = base.toLowerCase();
        String lremove = remove.toLowerCase();
        for(int i = 0 ; i <base.length();i++){
            if( i + len <= base.length() && lbase.substring(i,i+len).equals(lremove)){
                i +=len -1;
            }else{
                result += base.charAt(i);
            }
        }
        return result;
    }
}