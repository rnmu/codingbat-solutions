public class CountHi2 {
    public int countHi2(String str) {
        if(str.length() < 2){
            return 0;
        }
        if(str.length() >= 3 && str.startsWith("xhi")){
            return countHi2(str.substring(3));
        }
        if(str.startsWith("hi")){
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }
}