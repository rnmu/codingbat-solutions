public class Diff21{
public int diff21(int n) {
    if (n > 21) {
        return (Math.abs(n - 21)) * 2;
    } else {
        return Math.abs(n - 21);
    }
    }
}