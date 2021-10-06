class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        
        stack = []
        output = [-1]*len(nums)
        for idx in range(2*len(nums)-1, -1,-1):
                while len(stack) > 0 and nums[idx%len(nums)] >= stack[len(stack)-1]:
                            stack.pop()
                        
                print(idx % len(nums))    
                if len(stack)==0:
                        output[idx%len(nums)]=-1
                else:
                        output[idx%len(nums)]=stack[len(stack)-1]
                         
                stack.append(nums[idx%len(nums)])
         
                
        return output       
                    
                            
        
