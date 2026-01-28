class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        bin_string = str(bin(n))[2:]
        count:int = bin_string.count('1')
        pow_2:bool = n > 0 and count == 1
        return pow_2
        