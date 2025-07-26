public class DoubleX {
    boolean doubleX(String str) {
        int x = str.indexOf("x"); // first instance of x
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx") && i == x) {
                return true;
            }
        }
        return false;
    }
}