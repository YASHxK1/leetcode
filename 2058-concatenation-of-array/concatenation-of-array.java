class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length * 2;

        int[] ans= new int[size];

        for(int i=0;i<2;i++){
            int index=0;
            if(i==1)
            {
                index=nums.length;
            }
            for (int j=0; j<nums.length; j++){
                ans[index + j]=nums[j];
            }
        }
        return ans;
    }
}