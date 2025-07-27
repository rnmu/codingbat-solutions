public class StringYak {
    public String stringYak(String str) {
        String result = "";
        int len =  str.length();
        for(int i = 0 ;i<  len ;i++){
            // checks if it starts with yak
            if(i+2 <len &&str.charAt(i)== 'y' && str.charAt(i+2) == 'k'){
                i = i +2;
            }else{
                result += str.charAt(i);
            }
        }
        return result;
    }

}