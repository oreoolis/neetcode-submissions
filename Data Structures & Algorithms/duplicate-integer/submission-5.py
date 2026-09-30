class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        number = []
        for el in nums:
            if el in number:
                return True
            number.append(el)
        return False
                    
         