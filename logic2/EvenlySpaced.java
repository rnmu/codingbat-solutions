public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int  small = Math.min(a,Math.min(b,c));
        int  large = Math.max(a,Math.max(b,c));
        int  medium = (a+b+c) - small - large;
        if( Math.abs(small - medium) == Math.abs(medium - large)){
            return true;
        }else{
            return false;
        }
    }
}