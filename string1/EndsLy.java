public class EndsLy {
    public boolean endsLy(String str) {
        int len = str.length();
        if(len > 1 && str.substring(len-2,len).equals("ly")){
            return true;
        }
        return false;
    }
}