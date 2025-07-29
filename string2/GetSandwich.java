public class GetSandwich {
    public String getSandwich(String str) {
        int len = str.length();
        int count = 0;
        int start = 0;
        int end = 0;
        for(int i = 0 ; i< len-4 ; i++){
            if(str.substring(i,i+5).equals("bread")){
                if(count == 0){
                    count = 1;
                    start = i;

                }else{
                    end = i;
                }
            }
        }
        if( count >= 1 && end > start){
            return str.substring(start+5,end);
        }
        return "";
    }
}