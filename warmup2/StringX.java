public class StringX {
    public String stringX(String str) {
        String result = "";
        int len = str.length();
        for(int i = 1 ; i< len -1;i++){
            if(str.charAt(i) != 'x'){
                result += str.charAt(i) ;
            }
        }
        if(len >2){
            return str.charAt(0)+ result + str.charAt(len-1);
        }else{
            return str;
        }
    }
}