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

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    if (l1 == null && l2 == null) {
      return null;
    }

    ListNode result = new ListNode();

    return result;
  }
  
  public ListNode add(ListNode l1, ListNode l2, int acc) {
    if (l1 != null && l2 != null) {
      int sum = l1.getValue() + l2.getValue() + acc;
      int remain = sum % 10;
      int mode = sum == 0 ? 0 : sum / 10;
    }
  }
}

