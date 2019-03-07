package list;

import org.junit.Test;

public class MergeKListTest {

    @Test
    public void testListNode(){

        ListNode a1 = new ListNode(0);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(7);

        a1.next = a2;
        a2.next = a3;

        ListNode b1 = new ListNode(2);

        ListNode c1 = new ListNode(3);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);

        c1.next = c2;
        c2.next = c3;

        MergeKSortedList mksl = new MergeKSortedList();


        ListNode [] nodes = new ListNode[3];
        nodes[0] = a1;
        nodes[1] = b1;
        nodes[2] = c1;

        ListNode sorted = mksl.mergeKList(nodes);

        System.out.print("----- SORTED K-LIST ---->");
        while(sorted != null){
            System.out.print(sorted.val + "---->");
            sorted = sorted.next;
        }

    }
}
