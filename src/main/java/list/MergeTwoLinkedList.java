package list;

public class MergeTwoLinkedList {

    public ListNode mergeTwoList(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(!(l1 == null && l2 == null)){

            if(l1 == null){
                tail.next = l2;
                l2 = l2.next;
                continue;
            }

            else if(l2 == null){
                tail.next = l1;
                l1 = l1.next;
                continue;
            }

            if(l1.val < l2.val){
                tail.next = l1; //set the value to l1
                l1 = l1.next;  // move the pointer to the next item in line.
            }

            else {
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next; //move dummy by 1.

        }

        return dummy.next; //skip the first element.
    }

}
