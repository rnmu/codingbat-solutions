public class hasOne {
    public boolean hasOne(int n) {
        if(n==0){
            return false;
        }
        if(n%10 == 1){
            return true;
        }
        return hasOne(n/10);
    }
}