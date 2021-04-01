package leetcode;

import data.ListNode;
import java.util.List;

/*
https://leetcode.com/problems/add-two-numbers/

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Input: l1 = [0], l2 = [0]
Output: [0]

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumbers {

  // 시간 복잡도 O(max(l1.length, l2.length))
  public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return null;
    }

    return add(l1, l2, 0);
  }
  
  public ListNode add(ListNode l1, ListNode l2, int acc) {
    if (l1 != null && l2 != null) {
      int sum = l1.getValue() + l2.getValue() + acc;
      int value = sum % 10;
      int mode = sum == 0 ? 0 : sum / 10;

      return new ListNode(value, add(l1.getNext(), l2.getNext(), mode));
    } else if (l1 != null && l2 == null) {
      int sum = l1.getValue() + acc;
      int value = sum % 10;
      int mode = sum == 0 ? 0 : sum / 10;

      return new ListNode(value, add(l1.getNext(), null, mode));
    } else if (l1 == null && l2 != null) {
      int sum = l2.getValue() + acc;
      int value = sum % 10;
      int mode = sum == 0 ? 0 : sum / 10;

      return new ListNode(value, add(null, l2.getNext(), mode));
    } else {
      if (acc == 0) {
        return null;
      } else {
        return new ListNode(acc);
      }
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1;
    ListNode q = l2;
    ListNode current = dummyHead;

    int carry = 0;

    while (p != null || q != null) {
      int x = (p == null) ? 0 : p.getValue();
      int y = (q == null) ? 0 : q.getValue();
      int sum = x + y + carry;
      carry = sum / 10;
      current.setNext(new ListNode(sum % 10));
      current = current.getNext();

      if (p != null) {
        p = p.getNext();
      }

      if (q != null) {
        q = q.getNext();
      }
    }

    if (carry > 0) {
      current.setNext(new ListNode(carry));
    }

    return dummyHead.getNext();
  }
}

