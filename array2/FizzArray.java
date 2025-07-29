public class FizzArray {
    public int[] fizzArray(int n) {
        int[] fizz = new int[n];
        for (int i =0 ;i< fizz.length ; i++){
            fizz[i] = i;
        }
        return fizz;
    }
}