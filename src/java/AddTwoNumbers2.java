public class AddTwoNumbers2 {

  public static void main(String[] args) {
    System.out.println(addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))));
  }

  static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode sum = null;
    ListNode sumRoot = null;
    int carry = 0;
    while (l1 != null || l2 != null) {
      ListNode digit = new ListNode();
      if(l1 != null && l2 != null) {
        digit.val = (l1.val + l2.val + carry) % 10;
        carry = (l1.val + l2.val + carry) / 10;
        l1 = l1.next;
        l2 = l2.next;
      } else if(l1 == null) {
        digit.val = (l2.val + carry) % 10;
        carry = (l2.val + carry) / 10;
        l2 = l2.next;
      }
      else {
        digit.val = (l1.val + carry) % 10;
        carry = (l1.val + carry) / 10;
        l1 = l1.next;
      }
      if(sum == null) {
        sum = digit;
        sumRoot = sum;
      } else {
        sum.next = digit;
        sum = sum.next;
      }
    }
    if(carry != 0) {
      sum.next = new ListNode(carry);
    }
    return sumRoot;
  }
}

class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    return val + "," + next;
  }
}
