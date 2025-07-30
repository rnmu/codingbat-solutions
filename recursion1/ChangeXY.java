public class ChangeXY {
    public String changeXY(String str) {
        if(str.length() < 1){
            return str;
        }
        if(str.charAt(0) == 'x'){
            return "y" + changeXY(str.substring(1));
        }
        return str.substring(0,1) + changeXY(str.substring(1));
    }
}