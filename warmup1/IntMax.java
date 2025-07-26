public class IntMax {
    public int intMax(int a, int b, int c) {
        int maxAb = Math.max(a, b);
        int maxBc = Math.max(b, c);
        return Math.max(maxAb, maxBc);
    }
}