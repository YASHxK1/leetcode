def reverse_integer_slicing(num):
    s = str(abs(num))[::-1]
    return -int(s) if num < 0 else int(s)


class Solution:
    def isPalindrome(self, x: int) -> bool:
        rev = reverse_integer_slicing(x)
        if rev < 0:
            check:bool = False
        else:
            check:bool = rev == x

        return check
