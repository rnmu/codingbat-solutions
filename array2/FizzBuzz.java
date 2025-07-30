public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String [] result = new String[end-start];
        for(int i = 0 ; i <end-start ;i++){
            int num = start + i;
            if( num % 3 == 0 && num % 5 ==0){
                result[i] = "FizzBuzz";
            }else if( num % 3 == 0){
                result[i] = "Fizz";
            }else if(num % 5 ==0){
                result[i] = "Buzz";
            }else{
                result[i] =  String.valueOf(num);
            }
        }
        return result;
    }
}