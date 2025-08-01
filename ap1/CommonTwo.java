public class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        int i = 0;  // for a
        int j = 0 ;  // for b
        int count = 0 ;
        String prev = "";

        while(i<a.length && j < b.length){
            if(a[i].equals(b[j])){
                if(!a[i].equals(prev)){
                    count++;
                    prev = a[i];
                }
                i++;
                j++;
            }else if(a[i].compareTo(b[j]) < 0){
                i++;
            }else{
                j++;
            }
        }
        return count ;
    }
}