# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
import math
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        finalList = ListNode(0)
        head = finalList
        carry = 0
        while(l1 is not None or l2 is not None or carry > 0):
             sum = 0
             if l1 is not None:
                    sum = l1.val 
                    l1 = l1.next
             if l2 is not None:
                     sum = sum + l2.val
                     l2 = l2.next 
                        
             print('sum', sum, 'cary', carry)


             finalList.val  = (sum + carry) if((sum + carry) < 10) else (sum + carry)% 10
             print('finalList.value', finalList.val)   
             carry =  int(math.floor((sum + carry)/10))
             
             if(l1 is not None or l2 is not None or carry > 0):
                finalList.next = ListNode(0)  
                finalList = finalList.next
        
        print('finalList',head) 
        return head     
                     
