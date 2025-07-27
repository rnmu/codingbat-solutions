public class DeFront {
    public String deFront(String str) {
        int len = str.length();

        if(str.startsWith("ab")){
            return str;

            //keep 'a' if its the first char
        }else if(str.charAt(0) == 'a'){
            return str.charAt(0) + str.substring(2);

            //keep 'b' if its the second char
        }else if (str.charAt(1) == 'b'){
            return str.charAt(1) + str.substring(2);

            //remove first 2 characters
        }else{
            return str.substring(2);
        }
    }
}