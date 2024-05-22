package may;

import common.ListNode;

/**
 * <p> 题号82: 从排序列表中删除重复项</p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/22 22:16
 */
public class Code82_RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        while (p.next != null) {
            ListNode q = p.next;
            while (q != null && p.next.val == q.val) q = q.next;
            if(p.next.next == q) p = p.next;
            else p.next = q;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // 创建测试用例
        ListNode case1 = new ListNode(1, new ListNode(1, new ListNode(1)));
        ListNode case2 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        ListNode case3 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode case4 = new ListNode(1, new ListNode(2, new ListNode(3)));

        // 测试
        printList(new Code82_RemoveDuplicatesFromSortedList().deleteDuplicates(case1)); // 应输出空
        printList(new Code82_RemoveDuplicatesFromSortedList().deleteDuplicates(case2)); // 应输出 1 -> 3
        printList(new Code82_RemoveDuplicatesFromSortedList().deleteDuplicates(case3)); // 应输出 1
        printList(new Code82_RemoveDuplicatesFromSortedList().deleteDuplicates(case4)); // 应输出 1 -> 2 -> 3
    }


    // 打印链表的辅助方法
    public static void printList(ListNode node) {
        if (node == null) {
            System.out.println("Empty List");
        } else {
            while (node != null) {
                System.out.print(node.val + " -> ");
                node = node.next;
            }
            System.out.println("null");
        }
    }
}
