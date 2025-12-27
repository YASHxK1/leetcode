class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int count = 0;
        long total = 0;
        for(int i = happiness.length - 1; i>=0 && k>0; i--){
            int val = happiness[i] - count;
            if(val <= 0)break;
            total += val;
            k--;
            count++;
        } 
        return total;
    }
}