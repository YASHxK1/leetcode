class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        min_diff = float('inf')
        arr.sort()
        list1 = []

        for i in range(len(arr) - 1):
            diff = arr[i+1] - arr[i]
            if diff < min_diff:
                min_diff = diff

        for i in range(len(arr) - 1):
            if arr[i+1] - arr[i] == min_diff:
                list1.append([arr[i], arr[i+1]])              

        return list1
