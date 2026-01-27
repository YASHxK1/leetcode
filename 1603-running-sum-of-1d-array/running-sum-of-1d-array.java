class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum_arr = new int[nums.length];
        int sum =0;
        for (int i = 0; i <= nums.length-1;i++){
            //sum_arr[i] = sum;
            sum = sum + nums[i];
            sum_arr[i] = sum;
        }
        return sum_arr;
    }
}