public class InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if((equalOk && (a <= b && b <= c)) || (a < b && b < c)){
            return true;
        }else{
            return false;
        }
    }
}