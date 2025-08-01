public class mergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String [] result = new String [n];
        int i =0;
        int j = 0;
        for(int x =0 ;  x< n ;x++){
            if(a[i].compareTo(b[j]) < 0){
                result[x] = a[i++];
            }else if(a[i].compareTo(b[j]) > 0){
                result[x] = b[j++];
            }else{
                result[x] = a[i++];
                j++;
            }
        }
        return result ;
    }
}