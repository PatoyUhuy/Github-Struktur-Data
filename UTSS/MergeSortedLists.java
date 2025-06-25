public class MergeSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        
        //kode ini untuk semisal array-nya kosong/null, agar hasilnya nanti jadi null dan bukan error
        if (lists == null || lists.length == 0) {
            return null;
        }

        //node indikator awal dinyatakan, jadi pas mulai digabungin nanti next-nya dari yang pertama
        ListNode mergedList = lists[0];

        //kode ini untuk menjalankan logika ketika arraynya tidak kosong
        for (int i = 1; i < lists.length; i++) {
            mergedList = mergeTwoLists(mergedList, lists[i]); //menggabungkan list yang telah digabung dengan list yang selanjutnya 
        }
        return mergedList;
    }

    //kelas yang ini, gunanya buat logika ngegabungin 2 list
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        //membuat dummyHead agar lebih mudah saat menambah head di list node yang baru nanti
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        //kode ini adalah logika ketika list yang digabungkan nodenya belum 0/null
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            //menggeser pointer current ke node selanjutnya
            current = current.next;
        }

        //kode ini adalah logika ketika diurutkan, salah satu listnya masih ada node yang tersisa
        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }
        return dummyHead;
    }

    //kode ini adalah alat untuk mencetak list yang digabung tadi
    public static void printList(ListNode head) {
        ListNode current = head;

        //kode ini dijalankan ketika List gabungannya tidak memiliki node atau isi
        if (current == null) {
            System.out.println("(kosong)");
            return;
        }

        //kode ini dijalankan ketika node dalam list gabungan tidak 0/null
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