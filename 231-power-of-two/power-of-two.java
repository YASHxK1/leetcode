//java(error)
class Solution {
    public boolean isPowerOfTwo(int n) {
        String binaryString = Integer.toBinaryString(n);
        int count=0;
        for (int i=0;i<binaryString.length();i++){
            if(binaryString.charAt(i) == '1'){
                count++;
            }
        }
        boolean is_Power_Of_Two = n > 0 && count == 1;
        return is_Power_Of_Two;
    }
}
    // in python (correct working)
    // def isPowerOfTwo(self, n: int) -> bool:
    //     bin_string = str(bin(n))[2:]
    //     count:int = bin_string.count('1')
    //     pow_2:bool = n > 0 and count == 1
    //     return pow_2