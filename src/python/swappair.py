# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None:
            return head
        
        first_pointer = head
        
        if first_pointer.next is None:
            return first_pointer
        
        while first_pointer and first_pointer.next:
            second_pointer = first_pointer.next
            first_pointer.val,second_pointer.val = second_pointer.val,first_pointer.val
            first_pointer = second_pointer.next
            
        return head            
        
