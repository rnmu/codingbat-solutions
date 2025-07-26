public class EndUp {
    public String endUp(String str) {
        if (str.length() > 3) {
            int len = str.length() - 3;
            return str.substring(0, len) + str.substring(len).toUpperCase();
        } else {
            return str.toUpperCase();
        }
    }
}
