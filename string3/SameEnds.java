public class SameEnds {
    public String sameEnds(String string) {
        int len =string.length();
        String result ="";
        for(int i = 0;i<len/2;i++){
            String front = string.substring(0,i+1);
            String back = string.substring(len - i -1);
            if(front.equals(back)){
                result = front;
            }
        }
        return result;
    }
}