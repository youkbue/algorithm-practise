package may;

import common.ListNode;

/**
 * <p> 题号141: 环形链表 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/23 09:54
 */
public class Code141_CycleLinkedList {
    public boolean hasCycle(ListNode head) {
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) return true;
        }
        return false;
    }
}