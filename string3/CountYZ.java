public class CountYZ {
    public int countYZ(String str) {
        int count =0 ;
        str = str.toLowerCase();
        for(int i =0 ;i<str.length();i++){

            if((str.charAt(i) =='y' ||str.charAt(i) =='z')
                    && (i==str.length() -1 || !Character.isLetter(str.charAt(i+1)))){
                count++;
            }
        }
        return count;
    }
}