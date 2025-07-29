public class XyBalance {
    public boolean xyBalance(String str) {
        boolean foundY = true;
        for(int i = 0 ; i< str.length() ;i++){
            if(str.charAt(i) == 'x'){
                foundY = false;
            }
            if(str.charAt(i) == 'y') {
                foundY =  true;
            }
        }
        return foundY;
    }
}