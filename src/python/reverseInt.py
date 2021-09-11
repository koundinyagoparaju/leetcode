class Solution:
    def reverse(self, x: int) -> int:
         MAX_INT = 2**31-1
         reversed = 0
         negative = True if x < 0 else False
         x = abs(x)   
         print(negative)
         while(x > 0):
             reversed = (reversed*10) + (x%10)
             x = x // 10
         reversed = reversed if reversed <= MAX_INT else 0
         if(reversed > 0):
                reversed = reversed*(-1) if negative else reversed
         return reversed       
             
         
         
           
          
            
