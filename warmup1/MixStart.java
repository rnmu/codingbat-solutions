public MixStart {
    public boolean mixStart (String str){
        if (str.length() > 2 && str.substring(1, 3).equals("ix")) {
            return true;
        } else {
            return false;
        }
    }
}