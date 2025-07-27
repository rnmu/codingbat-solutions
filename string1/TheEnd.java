public class TheEnd {
    public String theEnd(String str, boolean front) {
        String result= "";
        if(front == true){
            result += str.charAt(0);
        }else{
            result += str.charAt(str.length()-1);
        }
        return result;
    }
}