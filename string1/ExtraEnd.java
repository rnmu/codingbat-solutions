public class ExtraEnd {
    public String extraEnd(String str) {
        int len = str.length();
        String last = str.substring(len-2,len);
        return last + last + last;
    }

}