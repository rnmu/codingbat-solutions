public class GreenTicket {
    public int greenTicket(int a, int b, int c) {
        if( (a == b && b != c) || (b == c && a != c) || (a == c && a != b)){
            return 10;
        }else if (a == b && b ==c){
            return 20;
        }else{
            return 0;
        }
    }
}