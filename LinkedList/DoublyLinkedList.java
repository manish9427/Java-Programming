package LinkedList;

public class DoublyLinkedList {
    Node head;

    public void insertFirst(int data){
        Node newNode  = new Node(data);
        if(head == null){
            head = newNode;
        }
    }

    public void insertMiddle(int data, int index) {
        Node newNode = new Node(data);
    
        if (head == null) {
            head = newNode; // If the list is empty, just make the new node the head
        } else if (index == 0) {
            // Special case: Insert at the beginning
            newNode.next = head;
            head.prev = newNode;
            head = newNode; // Update the head to point to the new node
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) {
                    // Handle the case where the index is out of bounds
                    System.out.println("Index out of bounds");
                    return;
                }
                current = current.next;
            }
    
            if (current == null) {
                // Handle the case where the index is out of bounds
                System.out.println("Index out of bounds");
                return;
            }
    
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
    }

    public void insertLast(int data){
        Node newNode  = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next!= null){
                current = current.next; 
            }
            current.next = newNode;
            newNode.prev = current; // Set the previous pointer of the new node
        }

    }
    

    public void show(){
        Node newNode = head;
        while(newNode != null){
            System.out.print(newNode.data + " <--> ");
            newNode = newNode.next;
        }
        System.out.print("null");
    }
    public  static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(1);
        list.insertLast(10);
        list.insertMiddle(0,0);
        list.show();
    }
}
