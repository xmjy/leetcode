package com.xm.jy.leetcode.sn.SN0200;

import com.xm.jy.leetcode.data_structure.ListNode;
import com.xm.jy.leetcode.util.ListNodeUtil;

import java.util.ArrayList;

/**
 * @author: albert.fang
 * @date: 2020/7/23 9:46
 * @description: 19. 删除链表的倒数第N个节点
 */
public class SN0019 {
    /**
     * 快慢指针
     * @param head
     * @param n
     * @return
     */
    private static ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(666);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy;
        // pre指针先走n步
        for (int i = 0; i < n + 1 ; i++) {
            pre = pre.next;
        }
        // pre和cur指针同时走
        while (pre != null){
            pre = pre.next;
            cur = cur.next;
        }
        // 断链操作
        cur.next = cur.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        removeNthFromEnd1(ListNodeUtil.generateListNode(new Integer[]{1}),1);
        ListNode listNode = ListNodeUtil.generateListNode(new Integer[]{1,2,3,4,5});
        ListNode p = listNode;
        ListNode q = listNode;
        // 断链操作
        p.next = p.next.next;
        System.out.println();

    }
}
