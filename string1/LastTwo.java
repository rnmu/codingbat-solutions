public class LastTwo {
    public String lastTwo(String str) {
        int last = str.length()-1;
        if(str.length() >2){
            return str.substring(0,last-1) + str.charAt(last) + str.charAt(last-1) ;
        }else if(str.length()==2){
            return "" + str.charAt(last) + str.charAt(last-1);
        }else{
            return str;
        }
    }
}