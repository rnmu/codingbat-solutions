public class NearTen {
    public boolean nearTen(int num) {
        if(num % 10 <= 2 || num % 10 >= 8){
            return true;
        }else{
            return false;
        }
    }
}