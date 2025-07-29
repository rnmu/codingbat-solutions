public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        for(int i = 0 ; i< str.length()-2;i++){
            if(str.substring(i,i+3).equals("xyz")){
                int left = i;
                int right = str.length() - (i+3);
                if(Math.abs(right- left) <=1){
                    return true;
                }
            }
        }
        return false;
    }
}