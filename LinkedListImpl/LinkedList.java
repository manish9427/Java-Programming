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
        
        list.show();  
    }
}