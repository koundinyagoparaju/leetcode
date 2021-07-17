class Solution(object):
    def twoSum(self, nums, target):
        traversed = {}
        if nums is None and  len(nums) == 0:
             return
        for index, num in enumerate(nums):
            if (target-num) not in traversed:
                traversed[num] = index
            else:
                return [traversed[target-num], index]

