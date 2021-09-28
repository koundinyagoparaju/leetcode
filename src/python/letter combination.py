class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        output = []
        if len(digits)==0:
            return output
        
        self.key_pad = ["0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"]
        self.generate_combination("", digits, 0, output)
        
        return output
        
        
    def generate_combination(self, combination, digits, position, output):
        if(len(combination)==len(digits)):
             output.append(combination)
             return   
                
                
        idx= int(digits[position])
        for chr in self.key_pad[idx]:
            self.generate_combination(combination+chr, digits, position+1, output)
        
        
        
        
