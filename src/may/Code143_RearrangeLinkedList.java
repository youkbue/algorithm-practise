package may;

import common.ListNode;

/**
 * <p> 题号143：重排链表 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/24 21:24
 */
public class Code143_RearrangeLinkedList {

    public void reorderList(ListNode head) {
        ListNode middleNode = middleNode(head);
        ListNode head2 = reverseLinkedList(middleNode);
        while(head2.next != null){
            ListNode lTemp = head.next;
            ListNode rTemp = head2.next;
            head.next = head2;
            head2.next = lTemp;
            head = lTemp;
            head2 = rTemp;
        }
    }
    // 876. 链表的中间结点
    private ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
