public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    //metode untuk memasukkan node baru pada awal listnya
    public void insertAtBeginning(String content) {
        Node newNode = new Node(content);
        newNode.next = head;
        head = newNode;
        System.out.println(content + "inserted at the beginning.");
    }
    
    //metode untuk memasukkan node baru pada akhir listnya
    public void insertAtEnd(String content) {
        Node newNode = new Node(content);
        if (head == null) {
            head = newNode;
            System.out.println(content + "inserted at the end.");
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        System.out.println(content + "inserted at the end.");
    }

    //metode untuk memasukkan node baru setelah given node
    public void insertAfter(Node prevNode, String content) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }
        Node newNode = new Node(content);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        System.out.println(content + "inserted after" + prevNode.content + ".");
    }

    // Metode untuk menghapus node dengan kunci yang diberikan
    public void deleteNode(String key) {
        Node temp = head, prev = null;

        //jika head nodenya memegang kunci penghapusannya sendiri
        if (temp != null && temp.content.equals(key)) {
            head = temp.next; //mengubah headnya
            System.out.println(key + "deleted.");
            return;
        }

        // Cari kunci untuk dihapuskan, tetap perhatikan node sebelumnya
        while (temp != null && !temp.content.equals(key)) {
            prev = temp;
            temp = temp.next;
        }

        // Jika kunci tidak ditemukan dalam linked list
        if (temp == null) {
            System.out.println(key + "not found.");
            return;
        }

        //memutuskan node dari linked list
        prev.next = temp.next;
        System.out.println(key + "deleted.");
    }

    // Metode untuk menjelajahi dan mencetak linked listnya
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.content + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Metode untuk mendapatkan node dengan datanya (untuk insertAfter example)
    public Node getNode(String content) {
        Node temp = head;
        while (temp != null) {
            if (temp.content.equals(content)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

}