class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res = {}
        for i in range(len(nums)):
            rem = target - nums[i]
            if rem in res:
                return [res[rem], i]
            res[nums[i]] = i
        return []