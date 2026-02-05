class Solution:
    def firstRepChar(self, s):
        # code here
        
        for i in range(len(s)):
            for j in range(i):
                
                if s[i] == s[j]:
                    return s[i]
        
        return "-1"