class Solution:
    def maxProductDifference(self, nums):
        nums.sort()
        s=set(nums)
        if len(s)==0:
            return 0
        else:
            return (nums[-1]*nums[-2])-(nums[0]*nums[1])