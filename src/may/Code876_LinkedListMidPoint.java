package may;

import common.ListNode;

/**
 * <p> 题号876：链表中点 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/24 20:36
 */
public class Code876_LinkedListMidPoint {

    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode f = head , s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
}
