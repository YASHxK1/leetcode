class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        s= s[:k][::-1] + s[k:]
        # s:str = s.reverse([0:k:])
        return s
        