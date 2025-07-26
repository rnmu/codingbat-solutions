public String frontBack(String str) {

    int len = str.length();
    if( len > 1){
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(len-1);
        return lastChar + str.substring(1,str.length()-1) + firstChar;
    }else{
        return str;
    }
}
