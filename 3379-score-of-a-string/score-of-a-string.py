#3110. Score of a String
class Solution:
    def scoreOfString(self, s: str) -> int:
        score:int =0
        for i in range(len(s)-1):
            score += abs(ord(s[i]) - ord(s[i+1]))
            print(ord(s[i]))
        return score