package may.write;

import common.ListNode;

/**
 *
 * <p> 题号92: 在区间反转链表 [left,right]模板 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/21 09:56
 */
public class Code92_ReverseLinkedListByIntervalTemplate {

    public void reverseBetweenTemplate(ListNode prev, int left, int right) {
        ListNode start = prev.next , then = start.next;
        for(int i = 0 ; i < right - left  ; i++){
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
    }
}
