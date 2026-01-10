class Solution {
    public int[] separateDigits(int[] nums) {
        //
        ArrayList<Integer> array = new ArrayList<>();
        int pivot=0;
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int count=0 ;
            while(n>0){
            array.add(pivot,n % 10);
            n = n / 10;
            count++ ;
            }
            pivot = pivot + count;
        }
        int[] result = new int[array.size()];
        // convert to array
        for(int j=0; j<array.size();j++){
            result[j]=array.get(j);
        }
    return result;       
        // 

}
}