/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LinkedListHalfReverse {
    public ListNode reverseList(ListNode head) {
        ListNode slowRunner = head;
        ListNode fastRunner = head;
        ListNode newNode = null;
        ListNode prev = null;
        while(fastRunner != null && fastRunner.next !=null )
        {
            prev = slowRunner;
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }
        while(slowRunner != null)
        {
            System.out.println("Inside while");
            ListNode nextNode = slowRunner.next;
            slowRunner.next = newNode;
            newNode = slowRunner;
            slowRunner = nextNode;
        }
        prev.next = newNode;
        return head;
    }
}