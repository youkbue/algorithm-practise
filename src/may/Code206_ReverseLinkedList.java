package may;

import common.ListNode;
import may.write.Code206_ReverseLinkedListTemplate;

/**
 * <p> 题号206：反转链表 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/18 17:21
 */
public class Code206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        Code206_ReverseLinkedListTemplate code206ReverseLinkedListTemplate = new Code206_ReverseLinkedListTemplate();
        return code206ReverseLinkedListTemplate.reverseList(head);
    }

    public static void main(String[] args) {
        Code206_ReverseLinkedList solution = new Code206_ReverseLinkedList();

        // 测试用例 1: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head1 = createLinkedList(new int[]{1, 2, 3, 4, 5});
        System.out.println("原链表: " + head1);
        ListNode reversed1 = solution.reverseList(head1);
        System.out.println("反转后链表: " + reversed1);

        // 测试用例 2: 1 -> null
        ListNode head2 = createLinkedList(new int[]{1});
        System.out.println("原链表: " + head2);
        ListNode reversed2 = solution.reverseList(head2);
        System.out.println("反转后链表: " + reversed2);

        // 测试用例 3: 空链表
        ListNode head3 = createLinkedList(new int[]{});
        System.out.println("原链表: " + head3);
        ListNode reversed3 = solution.reverseList(head3);
        System.out.println("反转后链表: " + reversed3);

        // 测试用例 4: 1 -> 2 -> null
        ListNode head4 = createLinkedList(new int[]{1, 2});
        System.out.println("原链表: " + head4);
        ListNode reversed4 = solution.reverseList(head4);
        System.out.println("反转后链表: " + reversed4);
    }
    // 辅助方法：根据数组创建链表
    private static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

}
