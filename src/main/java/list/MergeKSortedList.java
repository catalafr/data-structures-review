package list;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedList {

    /**
     * Input:
     * [
     *   1->4->5,
     *   1->3->4,
     *   2->6
     * ]
     * Output: 1->1->2->3->4->4->5->6
     * @param lists
     * @return
     */
    public ListNode mergeKList(ListNode [] lists){

        Queue<ListNode> heap = new PriorityQueue(new Comparator<ListNode>(){
            @Override public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });

        ListNode head = new ListNode(0);
        ListNode tail = head;

        for (ListNode node : lists)
            if (node != null) heap.offer(node);

        while (!heap.isEmpty()) {
            tail.next = heap.poll();
            tail = tail.next;

            if (tail.next != null)
                heap.offer(tail.next);
        }

        return head.next;
    }

}
