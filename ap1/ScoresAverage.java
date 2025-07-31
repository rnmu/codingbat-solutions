public class ScoresAverage {
    public int scoresAverage(int[] scores) {
        int half = scores.length/2;
        int front = average(scores,0,half);
        int back = average(scores,half,scores.length);

        return Math.max(front,back);
    }

    int average(int[] scores,int start, int end){
        int sum = 0;
        for(int i = start ; i<end ;i++){
            sum += scores[i];
        }
        return sum/(end - start);
    }
}