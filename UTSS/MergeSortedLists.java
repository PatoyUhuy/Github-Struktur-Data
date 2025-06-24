public class MergeSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode mergedList = lists[0];

        for (int i = 1; i < lists.length; i++) {
            mergedList = mergeTwoLists(mergedList, lists[i]);
        }
        return mergedList;
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }
        return dummyHead;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        if (current == null) {
            System.out.println("(kosong)");
            return;
        }
        while (current != null) {
            System.out.println(current.val);
            if (current.next != null) {
                System.out.println("->");
            }
            current = current.next;
        }
        System.out.println();
    }
}