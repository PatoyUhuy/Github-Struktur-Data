public class ListNode  {
    
    int val;
    ListNode next;

    //Konstruktor default, buat bikin dummyHead sebagai head node saat buat gabungan linked lists
    ListNode() {}

    //Konstruktor dengan nilai, buat nambahin node ke list dengan nilai yang diinginkan
    ListNode(int val) {
        this.val = val;
    }
}