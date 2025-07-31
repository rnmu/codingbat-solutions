public class scoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int count = 0;
        for(int i =0 ; i<key.length;i++){
            if(answers[i].equals("?")){
                continue;
            }else  if(key[i] == answers[i]){
                count +=4;
            }else{
                count -=1;
            }
        }
        return count;
    }
}