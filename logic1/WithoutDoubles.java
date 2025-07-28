public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(!noDoubles){
            return die1 + die2;
        }else if (die1 == die2){
            if(die1 == 6){
                die1 = 1;
            }else{
                die1 += 1 ;
            }
            return die1 + die2 ;
        }else{
            return die1 + die2 ;
        }
    }
}