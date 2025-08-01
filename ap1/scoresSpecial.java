public class scoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        int maxA = 0;
        int maxB = 0;
        for(int i =0;i<a.length ;i++){
            if(isSpecial(a[i]) && a[i] >maxA){
                maxA = a[i];
            }
        }
        for(int i =0;i<b.length ;i++){
            if(isSpecial(b[i]) && b[i] >maxB){
                maxB= b[i];
            }
        }

        return  maxA + maxB;
    }

    public boolean isSpecial(int n){
        if(n %10 ==0){
            return true;
        }
        return false;
    }
}