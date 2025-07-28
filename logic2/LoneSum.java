public class LoneSum {
    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if(b == c && b!= a){
            sum = a  ;
        }else if(a == b && b!= c){
            sum = c;
        }else if(a == c && a != b){
            sum = b;
        }else if (b == c && b== a) {
            sum = 0;
        }else{
            sum = a+ b+ c;
        }
        return sum;
    }
}