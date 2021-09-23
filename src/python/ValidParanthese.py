class Solution(object):
    def isValid(self, s):
        dict_brace = {')':'(',']':'[','}':'{'}
        stack = []
        print(dict_brace.values())
        for chr in s:
            print(chr)
            if chr not in dict_brace.keys():
                 print(chr)
                 stack.append(chr)
            else:
                if len(stack) > 0 and dict_brace.get(chr,None) == stack[-1]:
                    stack.pop()
                else:
                      return False
                    
        return  len(stack) == 0           
            
