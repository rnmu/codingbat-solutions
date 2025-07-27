public class FrontAgain {
    public boolean frontAgain(String str){
        int len = str.length();
        if(len < 2){
            return false;
        }
        if(str.substring(0,2).equals(str.substring(len-2))){
            return true;
        }
        return false;
    }
}