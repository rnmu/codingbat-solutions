public class CountX {
    public int countX(String str) {
        if(str.isEmpty()){
            return 0;
        }
        int count =0;
        if(str.charAt(0) == 'x'){
            count +=1;
        }
        return count + countX(str.substring(1));
    }
}