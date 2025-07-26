public String missingChar(String str, int n) {

    int len = str.length();

    String  firstHalf = str.substring(0,n);
    String secondHalf = str.substring(n+1,len);

    return firstHalf + secondHalf;
}