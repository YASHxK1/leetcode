class Solution:
    def reverse(self, x: int) -> int:
        s = str(abs(x))
        rev = int(''.join(reversed(s)))
        if rev > 2**31 -1:
            return 0
        return -int(rev) if x < 0 else int(rev)  