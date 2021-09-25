class Solution(object):
    
    def generateParenthesis(self, n):
        
        start_bracket = 0
        end_bracket = 0
        self.output =  []
        self.generate_pattern(n, start_bracket+1, end_bracket, "(")
        print(self.output)
        return self.output
        
        
    def generate_pattern(self, n, start_bracket, end_bracket, paranthesis):
                
        if len(paranthesis) == 2*n:
            self.output.append(paranthesis)
            return
        
        if start_bracket < n:
            self.generate_pattern(n, start_bracket+1, end_bracket, paranthesis+"(")
        if end_bracket < start_bracket:
             self.generate_pattern(n, start_bracket, end_bracket+1, paranthesis+")")
           
            
        
          
        
        
        
            
        
