class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void tambahNode(int n) {
        Node newNode = new Node(n);
        if (head == null) { //jika linked list masih kosong
            head = newNode;
        } else if (n < head.data) { //jika nilai n lebih kecil dari pada nilai head
            newNode.next = head;
            head = newNode;
        } else { //jika nilai n lebih besar atau samadengan nilai head
            Node current = head;
            while (current.next != null && current.next.data < n) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void tampilkan() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}

public class kegiatan2 {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();

        mylist.tambahNode(3);
        mylist.tambahNode(9);
        mylist.tambahNode(1);
        mylist.tambahNode(100);

        mylist.tampilkan();
    }
}
