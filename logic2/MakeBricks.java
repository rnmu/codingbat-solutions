public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int use = Math.min(big,goal/5);
        int remain  = goal - (use*5);
        if(small >= remain){
            return true;
        }else{
            return false;
        }
    }
}