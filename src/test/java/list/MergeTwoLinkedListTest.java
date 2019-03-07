package list;

import org.junit.Test;
import list.MergeTwoLinkedList;


public class MergeTwoLinkedListTest {


    @Test
    public void mergeTwoListTest(){

        ListNode h1 = new ListNode(0);
        ListNode n2 = new ListNode(2);

        h1.next = n2;

        ListNode h2 = new ListNode(-1);
        ListNode n22 = new ListNode(3);
        ListNode n33 = new ListNode(7);
        ListNode n44 = new ListNode(9);

        h2.next = n22;
        n22.next = n33;
        n33.next = n44;

        MergeTwoLinkedList mtll = new MergeTwoLinkedList();

        ListNode merged = mtll.mergeTwoList(h1,h2);
        ListNode pointer = merged;

        System.out.print("----- SORTED 2-LIST ---->");
        while(pointer != null){
            System.out.print(pointer.val + "---->");
            pointer = pointer.next;
        }

    }


}
