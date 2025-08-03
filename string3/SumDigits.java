public class SumDigits {
    public int sumDigits(String str) {
        int count  = 0;
        for(int i = 0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return count;
    }
}