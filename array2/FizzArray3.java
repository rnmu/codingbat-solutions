public class FizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int diff = end-start;
        int [] result = new int[ end-start];
        for(int i = 0 ; i< diff ;i++){
            result[i] = start;
            start+=1;
        }
        return result;
    }
}