
public class linklist {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    linklist() {
        this.head = null;
    }
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    void display() {
        if (head == null) {
            System.out.println("empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linklist m = new linklist();
        m.insert(10);
        m.insert(20);
        m.insert(30);
        m.insert(40);
        m.insert(50);
        m.display();
    }
}
