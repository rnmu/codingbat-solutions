public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int use = Math.min(big,goal/5);
        int remain  = goal - (use*5);
        if(small >= remain){
            return remain;
        }else{
            return -1;
        }
    }
}