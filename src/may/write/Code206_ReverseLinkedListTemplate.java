package may.write;

import common.ListNode;

/**
 * <p> 题号206：反转链表模板 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/18 17:32
 */
public class Code206_ReverseLinkedListTemplate {

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode a = head, b = a.next;
        while (b != null){
            ListNode temp = b.next;
            b.next = a;
            a = b;
            b = temp;
        }
        head.next = null;
        return a;
    }

}
