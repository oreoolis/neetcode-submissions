class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        res, res2 = {}, {}
        count = 1
        
        for ch in s:
            if ch not in res:
                res[ch] = count
            else:
                res[ch] += count

        for ch in t:
            if ch not in res2:
                res2[ch] = count
            else:
                res2[ch] += count

        for key, value in res2.items():
            if key not in res:
                return False
            elif res2[key] != res[key]:
                return False
        return True

        