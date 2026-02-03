class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res_nums=[]
        for i in nums1:
            if i in nums2:
                if i not in res_nums:
                    res_nums.append(i)
                    
        return res_nums