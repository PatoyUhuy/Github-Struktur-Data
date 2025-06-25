public class MainMergeSortedLists {
    public static void main(String[] args) {
        MergeSortedLists merger = new MergeSortedLists(); //membuat variabel merger untuk memanggil kode untuk menggabungkan listnya nanti

        //kasus pertama: penggabungan biasa
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists1 = {l1, l2, l3};
        ListNode results1 = merger.mergeKLists(lists1);

        System.out.println("Hasil Penggabungan (yang pertama): ");
        MergeSortedLists.printList(results1);

        //kasus kedua: tidak ada list dalam arraynya
        ListNode[] lists2 = {};
        ListNode results2 = merger.mergeKLists(lists2);

        System.out.println("Hasil Penggabungan (bila array-nya kosong):");
        MergeSortedLists.printList(results2);

        //kasus ketiga: bila ada list yang isinya kosong di dalam array
        ListNode l4 = new ListNode(5);
        l4.next = new ListNode(7);
        ListNode l5 = null;
        ListNode l6 = new ListNode(9);
        l6.next = new ListNode(11);

        ListNode[] lists3 = {l4, l5, l6};
        ListNode results3 = merger.mergeKLists(lists3);

        System.out.println("Hasil Penggabungan (bila ada list yg kosong): ");
        MergeSortedLists.printList(results3);

        //kasus keempat: bila hanya ada satu list dalam array
        ListNode l7 = new ListNode(4);
        l7.next = new ListNode(8);
        l7.next.next = new ListNode(12);

        ListNode[] lists4 = {l7};
        ListNode results4 = merger.mergeKLists(lists4);

        System.out.println("Hasil Penggabungan (bila hanya ada satu list): ");
        MergeSortedLists.printList(results4);

    }
}