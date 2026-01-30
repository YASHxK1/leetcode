class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int x=0 , y=0;
        int count=0;
        int len = nums.size();

        for(int i =0; i<len; i++){
            for(int j=0; j<len; j++){
                if (i==j){
                    continue;
                }else if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
        }
        return count/2;       
    }
}