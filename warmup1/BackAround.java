public String backAround(String str) {
    int len = str.length()-1;
    char lastChar = str.charAt(len);
    return lastChar + str + lastChar;
}