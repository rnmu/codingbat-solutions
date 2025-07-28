public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep){
            return false;
        }else if(isMorning && isMom){
            return true;
        }else if(!isMorning){
            return true;
        }else{
            return false;
        }
    }
}