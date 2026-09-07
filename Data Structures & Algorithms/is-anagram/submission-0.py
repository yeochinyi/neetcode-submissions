class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        count = {}
        for atS, atT in zip(s,t):
            count[atS] = count.get(atS,0) + 1
            count[atT] = count.get(atT,0) - 1
        return all(c == 0 for c in count.values())

        
        