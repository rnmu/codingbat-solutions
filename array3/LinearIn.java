public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        int j =0;
        for(int i= 0 ; i<outer.length && j<inner.length ;i++ ){
            if(outer[i] == inner[j]){
                j++;
            }else if(outer[i] > inner[j]){
                return false;
            }
        }
        if(j == inner.length){
            return true;
        }
        return false;
    }
}