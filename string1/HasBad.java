public class HasBad {
    public boolean hasBad(String str) {
        int len = str.length();
        //if "bad" appears starting at index 0
        if(len > 2 && str.substring(0,3).equals("bad")){
            return true;
            //if "bad" appears starting at index 1
        }else if (len > 3 &&str.substring(1,4).equals("bad")){
            return true;
        }
        return false;
    }
}