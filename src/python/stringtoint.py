import sys
class Solution:
    def myAtoi(self, s: str) -> int:
        #print(dir(s))
        # Read in and ignore any leading whitespace.
        finalvalue:str
        negative = False  
        MIN_INT = 2**31
        MAX_INT = 2**31-1

        s = s.strip()
        if len(s) > 0:
            negative =  True if s[0] == '-' else False
            if negative or s[0] == '+':
               s = s[1:]
        try:
            finalvalue = s
            for i in range(len(s)):
                if not s[i].isdigit():
                    finalvalue =  s[:i]
                    break
                    print("finalvalue ------------", finalvalue)

            val = int(finalvalue)
            if not negative and val > MAX_INT:
                val = MAX_INT
            elif negative and   val > MIN_INT:
                val = MIN_INT
                
            return (-1) * val if negative else val
        except Exception as e:
            print("here.....", e)
       
        return 0
            
             
            
            
        
         
