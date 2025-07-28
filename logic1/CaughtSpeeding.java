public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int extra = 0;
        if(isBirthday){
            extra = 5;
        }
        if(speed <= 60 + extra){
            return 0;
        }else if(speed >= 61+extra && speed <= 80 + extra){
            return 1;
        }else{
            return 2;
        }
    }
}