class Solution {
    public int majorityElement(int[] nums) {
        int mejority =nums[0];
        int count=1;
 
        for (int i=0;i<nums.length-1;i++){
            if(mejority==nums[i+1]){
                count++;
            }
            else if(mejority!=nums[i+1]){
                count--;
            }
            if (count==0)
            {
                mejority=nums[i];
                count++;
            }
        }
        return mejority;
        
    }
}