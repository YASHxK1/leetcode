class Solution {
    public int differenceOfSum(int[] nums) {
        // start of seperating numbers
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            while(n>0){
            array.add(n % 10);
            n = n / 10;
            }
        }
        int[] result = new int[array.size()];
        // convert to array
        for(int j=0; j<array.size();j++){
            result[j]=array.get(j);
        }
        //end of seperating numbers
        //start of adding nums
        int sumofarray=0;
        for (int i =0;i<nums.length;i++){
            sumofarray= sumofarray + nums[i];
        }
        int sumofresult=0;
        for (int i=0;i<result.length;i++){
            sumofresult=sumofresult+result[i];
        }
        
    return Math.abs(sumofarray-sumofresult);       

        
    }
}