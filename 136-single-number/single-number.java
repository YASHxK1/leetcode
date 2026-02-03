// 136. Single Number
class Solution {
    public int singleNumber(int[] nums) {
        
        int Single_Num = 0;

        for (int i =0;i<nums.length;i++){
            boolean is_duplicate = false;

            for(int j = 0;j < nums.length;j++){
                if (i == j){
                    continue;
                }
                if (nums[i] == nums[j]){
                    is_duplicate = true; 
                    break;                  
                }
            }
            if(!is_duplicate){
                Single_Num = nums[i];
                break;
            }
        }
        return Single_Num;
    }
}