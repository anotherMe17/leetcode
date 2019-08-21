package io.github.anotherme17.algorithms.middle;


/**
 * @author lirenhao
 * date: 2019-08-15 17:20
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 */
public class A2两数相加 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0, 0);
    }

    public ListNode add(ListNode l1, ListNode l2, int up, int deep) {
        int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + up;
        if (sum == 0 && l1 == null && l2 == null)
            return deep == 0 ? new ListNode(0) : null;
        up = sum / 10;
        ListNode add = new ListNode(sum % 10);
        add.next = add(l1 == null ? null : l1.next, l2 == null ? null : l2.next, up, ++deep);
        return add;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}
