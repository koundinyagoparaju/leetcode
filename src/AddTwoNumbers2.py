class Solution(object):
    def twoSum(self, nums, target):
        left_over = []
        if nums is None and  len(nums) == 0
             return
        for index, num in enumerate(nums):
            if (target-num) not in left_over:
                left_over.add(num)
            else
                return [nums.index(target-num), index]


