public class Left2 {
    public String left2(String str) {
        int len = str.length();
        if(len >2){
        return str.substring(2,len)+ str.substring(0,2);
    }else{
        return str;
    }
}
}