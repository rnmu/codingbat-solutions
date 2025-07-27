public class TwoChar {
    public String twoChar(String str, int index) {
        if(index < 0 || str.length() < 2 || index+1 > str.length()-1 ){
            return str.substring(0,2);
        }else{
            return str.substring(index,index+2);
        }
    }
}