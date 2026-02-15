class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        mejority = nums[0]
        count = 1

        for i in range(1, len(nums)):
            if count == 0:
                mejority = nums[i]
                count = 1
            elif nums[i] == mejority:
                count += 1
            else:
                count -= 1
                
        return mejority 