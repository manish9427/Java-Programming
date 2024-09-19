public class DoublyLL {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    DoublyLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAtPosition(int data, int pos) {
        if (pos <= 0) {
            throw new IllegalArgumentException("Position must be greater than 0");
        }

        if (pos == 1) {
            insertAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 1; current != null && i < pos - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IllegalArgumentException("Position Out of Bound");
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <--> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DoublyLL main = new DoublyLL();
        main.insertAtFirst(1);
        main.insertAtLast(5);
        main.insertAtPosition(3, 3);
        main.deleteAtFirst();
        main.display();
    }
}
