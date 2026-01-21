from collections import Counter as cnt
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        is_Anagram: bool = (cnt(s) == cnt(t))
        return is_Anagram
        