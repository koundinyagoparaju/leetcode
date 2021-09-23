class Solution(object):
    def isNumber(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s)  == 0 or (len(s)  == 1 and not s[0] in ['0','1','2','3','4','5','6','7','8','9']):
            return False
        
        
        state = {
                  'signpassed':False, 
                  'decimalpassed':False,
                  'numberPassed':False,
                  'exponentialPassed':False
                    }
        
        last_char = None
        
        for chr in s:
            if chr in ['+', '-'] and ((last_char in ['e']) or (not state['decimalpassed'] and not state['numberPassed'] and not state['exponentialPassed'])):
                     state['signpassed'] = True
            elif  chr.isdigit():     
                    state['numberPassed'] = True
            elif  chr in ['.'] and not state['exponentialPassed'] and not state['decimalpassed']:  
                state['decimalpassed'] = True
            elif   chr in ['e','E']  and not state['exponentialPassed'] and state['numberPassed']:    
                state['exponentialPassed'] = True
                state['numberPassed'] = False
            else:
                return False
            last_char = chr
         
        return True and state['numberPassed']
                
