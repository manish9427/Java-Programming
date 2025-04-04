package LinkedListImpl;

class Node {
    int data;
    Node next;

    Node(int data) {  
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

        Node head;

        // Insert at end
        public void insert(int data) {
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

        // Remove by value (first occurrence)
        public void remove(int data) {
            if (head == null) return;  // Empty list

            // Case 1: Remove head
            if (head.data == data) {
                head = head.next;
                return;
            }

            // Case 2: Remove middle or tail
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;  // Bypass the node to remove
            }else{
                System.out.println(data + " Element not found in list.");
                return;  // Element not found in list
            }
            
        
        }

        // Print the list
        public void show() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println(" -> null");
        }

 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insert(5);
        list.insert(0);
        list.insert(10);
        list.remove(3);
        
        list.show();  
    }
}