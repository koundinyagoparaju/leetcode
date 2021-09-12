class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 or x > 2**31-1:
             return False
        
        return self.isPalindrome(x)
        
        
        
    def isPalindrome(self, s: int):
        st = str(s)
        start = 0
        end = len(st)-1
        while start <= end:
             if st[start] != st[end]:
                    return False
             start+=1
             end-=1
        return end-start <=1        
                
                
        
        
