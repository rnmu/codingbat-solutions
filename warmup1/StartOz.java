public class StartOz {
    public String startOz(String str) {
        if (str.length() > 1 && str.startsWith("oz")) {
            return "oz";
        } else if (str.length() > 0 && str.startsWith("o")) {
            return "o";
        } else if (str.length() > 0 && str.charAt(1) == 'z') {
            return "z";
        } else {
            return "";
        }
    }
}