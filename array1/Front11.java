public class Front11 {
    public int[] front11(int[] a, int[] b) {
        int size = 0;
        if(a.length> 0 && b.length> 0){
            size = 2;
        }else if(a.length> 0 || b.length > 0){
            size = 1;
        }else{
            size = 0;
        }
        int [] result = new int[size];
        if(a.length == 0 && b.length > 0){
            result[0] = b[0];
        }else if(b.length == 0 && a.length > 0){
            result[0] = a[0];
        }else if(a.length > 0 && b.length > 0){
            result[0] = a[0];
            result[1] = b[0];
        }

        return result;
    }
}