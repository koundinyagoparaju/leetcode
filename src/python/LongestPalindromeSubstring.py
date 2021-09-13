class Solution:
    
    def __init__(self):
        self.resultStart=0
        self.resultLength=0  
    
    def expandCenter(self, s:str, start:int, end:int):
        while start >= 0 and end < len(s) and s[start] == s[end]:
            start -=1
            end +=1
        if  self.resultLength < end-start-1:
              self.resultStart = start + 1
              self.resultLength = end-start-1   
                    
    def longestPalindrome(self, s: str) -> str:
        len_of_str = len(s)
        if len_of_str < 2:
              return s
        for start in range(len_of_str):
            self.expandCenter(s, start, start)
            self.expandCenter(s, start, start+1)
            
        return s[self.resultStart: self.resultStart+self.resultLength]    
   
    
        
        
