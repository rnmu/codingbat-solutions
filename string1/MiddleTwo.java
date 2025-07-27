public class MiddleTwo {
    public String middleTwo(String str) {
        int len = str.length()/2;
        if(len< 2){
            return str ;
        }else{
            return str.substring(len-1,len+1);
        }
    }
}