public class LuckySum {
    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }
}