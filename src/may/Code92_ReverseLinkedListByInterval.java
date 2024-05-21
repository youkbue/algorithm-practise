package may;

import common.ListNode;

/**
 * <p> 题号92: 在区间反转链表 [left,right] </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/21 09:48
 */
public class Code92_ReverseLinkedListByInterval {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 1 ; i < left ; i++){
            prev = prev.next;
        }
        ListNode start = prev.next , then = start.next;
        for(int i = 0 ; i < right - left ; i++){
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        return dummy.next;
    }
}
