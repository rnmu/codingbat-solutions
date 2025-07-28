public class SumLimit {
    public int sumLimit(int a, int b) {
        int lenA = String.valueOf(a).length();
        int lenSum = String.valueOf(a+b).length();
        if(lenSum == lenA){
            return a +b;
        }else{
            return a;
        }
    }
}