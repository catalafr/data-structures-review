package list;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeTwoLinkedList2 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        Queue<ListNode> queue = new PriorityQueue(new Comparator<ListNode>(){
            @Override public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });

        if(l1 != null)
            queue.add(l1);

        if(l2 != null)
            queue.add(l2);

        ListNode current = new ListNode(0);
        ListNode tail = current;

        while (!queue.isEmpty()) {
            current.next = queue.poll();
            current = current.next;
            if (current.next != null){
                queue.add(current.next);
            }

        }

        return tail.next;
    }
}

