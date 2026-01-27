import numpy as np
class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        transp = np.array(matrix).T.tolist()

        return transp
        