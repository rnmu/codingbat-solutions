public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int [] result = new int[2];
        //if a contains 2 elements
        if(a.length > 1){
            result[0] = a[0];
            result[1] = a[1];
            //if a contains 1 elements
        }else if( a.length == 1 && b.length >= 1){
            result[0] = a[0];
            result[1] = b[0];
            //if a is empty
        }else if(b.length > 1){
            result[0] = b[0];
            result[1] = b[1];
        }
        return result;
    }
}