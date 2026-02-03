from math import sqrt
class Solution:
    def pivotInteger(self, n: int) -> int:
        ans:int = n*(n + 1) / 2
        sq = int(sqrt(ans))
        
        if(sq*sq==ans) : return sq
        else: return -1
        