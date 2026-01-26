import numpy as np

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        num:float = 0
        merged = np.array(nums1 + nums2)
        num:float = np.median(merged)
        
        #print(merged)
                
        return num
        