public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        //Masukkan Elemen
        list.insertAtEnd("Argus");
        list.insertAtBeginning("Balmond");
        list.insertAtEnd("Chang'e");
        list.insertAtEnd("Dyrroth");

        //Cetak listnya
        System.out.println("Linked List after insertions:");
        list.printList(); //Seharusnya muncul: Balmond -> Argus -> Chang'e -> Dyrroth

        //Memasukkan setelah node tertentu
        Node nodeArgus = list.getNode("Argus");
        if (nodeArgus != null) {
            list.insertAfter(nodeArgus, "Roger");
        }

        //cetak list setelah insertAfter
        System.out.println("\nLinked List after inserting Roger after Argus");
        list.printList(); //Seharusnya muncul: Balmond -> Argus -> Roger -> Chang'e -> Dyrroth -> null

        //Menghapus node
        list.deleteNode("Chang'e");

        //Mencetak list setelah penghapusan node
        System.out.println("\nLinked List after deleting Chang'e");
        list.printList(); //Seharusnya muncul: Balmond -> Argus -> Roger -> Dyrroth -> null

        //Menghapus node yang tidak ada
        list.deleteNode("Kimmy");

        //Mencetak list setelah penghapusan node yang tidak ada
        System.out.println("\nLinked List after trying to delete Kimmy");
        list.printList(); //Seharusnya muncul: Balmond -> Argus -> Roger -> Dyrroth -> null
    }
}