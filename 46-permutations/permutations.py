import itertools

class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        perm_set = itertools.permutations(nums)
        return [list(p) for p in perm_set]
        