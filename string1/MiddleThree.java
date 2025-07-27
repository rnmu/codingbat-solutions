public class MiddleThree {
    public String middleThree(String str) {
        if(str.length() <= 3){
            return str;
        }else{
            int len = str.length() /2;
            return str.substring(len-1,len+2);
        }
    }
}