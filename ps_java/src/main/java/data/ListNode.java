package data;

public class ListNode {
   int val;
   ListNode next;
   public ListNode() {}
   public ListNode(int val) { this.val = val; }
   public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

   public int getValue() {
     return val;
   }

   public ListNode getNext() {
     return next;
   }

   public void setNext(ListNode next) {
     this.next = next;
   }
 }