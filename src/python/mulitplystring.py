class Solution(object):
    def multiply(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        
        if num1 == "0" or num2 == "0":
            return "0"
        carry = 0
        result = 0
        for i in range(len(num1)):
              for j in range(len(num2)-1,-1,-1):
                    result += (ord(num1[i]) - ord('0')) * (ord(num2[j]) - ord('0'))* (10**(len(num1) + len(num2) - (i + j + 2)))
                    
        return str(result)
        
        
